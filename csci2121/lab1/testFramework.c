#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#include "testFramework.h"

#define NUM_TESTS 33
#define NUM_RAND 10
#define ERROR_LIMIT 5

char* functionName = NULL; // I set this if -f is used.
int functionCount = 0;

typedef struct {
  int errors;
  double points;
} TestOutput;

// Gets the count of the declarative test set.
// If a test was named using -f, functionName will not be null.
// If functionName is not NULL and the function is not found, return 0 else true.
int initializeTestSet(){
  int i;
  int functionValid = 0;
  if(functionName == NULL)
    functionValid = 1; // Function option not used, auto confirm.
  
  for(i = 0; test_set[i].lab_function; i++) {
    if(!functionValid && !strcmp(functionName, test_set[i].name))
      functionValid = 1; // A function matched, valid so confirm.
  }
  if(!functionValid)
    printf("function %s not found.\n", functionName);

  functionCount = i;
  return functionValid;
}

// Prints the help with -h
void displayHelp(char* progName){
  printf("Usage: %s [-h] [-f <function name>]\n", progName);
  printf("  -h         Prints this message.\n");
  printf("  -f <name>  Only tests one function.\n");
  exit(1);
}

// Gets a random number within a range.
// There may be a bug with the way I get this to work.  random and rand
// get a random number between 0 and RAND_MAX which mostly is INT_MAX.
// So the sign bit may always be positive, but I do get random negative
// numbers and it is ranodm enough.
int randVal(int min, int max){
  int retVal;
  unsigned int range = ((unsigned int) max) - ((unsigned int) min);  
  long randLong = random(); // random number between 0 and RAND_MAX.
  if(range > RAND_MAX){
    randLong = (randLong << sizeof(int)) | random();
  }
  retVal = (randLong % range) + min;
  return retVal;
}

// Returns the number of tests put into the array.  
// Simply add any specific number to the list that you want to try.
int createTestValues(int *array, int min, int max) {
  int i;
  int testCount = 0;
  // If we can itterate through all values, do so.
  if (max-NUM_TESTS < min) {
    for (i = min; i <= max; i++)
      array[testCount++] = i;
    return testCount;
  }
  // Else, pick values around the edge, some random points in the middle, and 
  array[testCount++] = 0;
  array[testCount++] = min;
  array[testCount++] = max;
  array[testCount++] = 1;
  array[testCount++] = -1;
  for(i = 0; i < NUM_RAND; i++) {
    array[testCount++] = randVal(min, max);
  }
  return testCount;
}

// Begining of function testers.
// Given the number of args, calls the same args on both functions and compares if the results are the same.
// If they are not returns 1, if they match 0. 
// If there is an error, it prints an output.
// Try not to have too much output.

int test0Args(function_t labFun, function_t testFun, char* name){
  int labVal = labFun();
  int testVal = testFun();
  int error = labVal != testVal;
  if(error){
    printf("Function %s was incorect.\n\t %s() returned 0x%08x, expected  0x%08x\n" , name, name, labVal, testVal);
  }
  return error;
}

int test1Args(function_t labFun_0, function_t testFun_0, int param1, char* name){
  function1_t labFun = (function1_t) labFun_0;
  function1_t testFun = (function1_t) testFun_0;
  int labVal = labFun(param1);
  int testVal = testFun(param1);
  int error = labVal != testVal;
  if(error){
    printf("Function %s was incorect.\n\t %s(0x%08x) returned 0x%08x, expected  0x%08x\n" , name, name, param1, labVal, testVal);
  }
  return error;
}

int test2Args(function_t labFun_0, function_t testFun_0, int param1, int param2, char* name){
  function2_t labFun = (function2_t) labFun_0;
  function2_t testFun = (function2_t) testFun_0;
  int labVal = labFun(param1, param2);
  int testVal = testFun(param1, param2);
  int error = labVal != testVal;
  if(error){
    printf("Function %s was incorect.\n\t %s(0x%08x, 0x%08x) returned 0x%08x, expected  0x%08x\n" , name, name, param1, param2, labVal, testVal);
  }
  return error;
}

int test3Args(function_t labFun_0, function_t testFun_0, int param1, int param2, int param3, char* name){
  function3_t labFun = (function3_t) labFun_0;
  function3_t testFun = (function3_t) testFun_0;
  int labVal = labFun(param1, param2, param3);
  int testVal = testFun(param1, param2, param3);
  int error = labVal != testVal;
  if(error){
    printf("Function %s was incorect.\n\t %s(0x%08x, 0x%08x, 0x%08x) returned 0x%08x, expected  0x%08x\n" , name, name, param1, param2, param3, labVal, testVal);
  }
  return error;
}

// Tests a test struct as declared in decl.c.
// Generates test values for the number of function arguments.
// Then for every value, tries to tests it with every other value.
// I put in the ERROR_LIMIT, so if there are errors, you can limit the output.
// Score is taken from the last version of this file.
// 1 for all correct.
// 0.5 for 1 wrong.
// 0 for more then 1 wrong.
// NOTE: while we could stop ERROR_LIMIT at 2 for scoring, the amount is potentialy useful for debuging.
TestOutput testFunction(test_rec* test){
  TestOutput t;
  int i;
  int testValues[3][NUM_TESTS];
  int i0, i1, i2;
  int valueCounts[3];
 
  for(i=0; i < test->argc; i++)
    valueCounts[i] = createTestValues(testValues[i], test->arg_ranges[i][0], test->arg_ranges[i][1]);
 
  t.errors = 0;

  switch(test->argc){
  case 0:
    t.errors += test0Args(test->lab_function, test->test_function, test->name);
    break;
  case 1:
    for(i0 = 0; i0 < valueCounts[0] && t.errors < ERROR_LIMIT; i0++)
      t.errors += test1Args(test->lab_function, test->test_function, testValues[0][i0], test->name);
    break;
  case 2:
    for(i0 = 0; i0 < valueCounts[0] && t.errors < ERROR_LIMIT; i0++)
      for(i1 = 0; i1 < valueCounts[1] && t.errors < ERROR_LIMIT; i1++)
	t.errors += test2Args(test->lab_function, test->test_function, testValues[0][i0], testValues[1][i1], test->name);
    break;
  case 3:
    for(i0 = 0; i0 < valueCounts[0] && t.errors < ERROR_LIMIT; i0++)
      for(i1 = 0; i1 < valueCounts[1] && t.errors < ERROR_LIMIT; i1++)
	for(i2 = 0; i2 < valueCounts[2] && t.errors < ERROR_LIMIT; i2++)
	  t.errors += test3Args(test->lab_function, test->test_function, testValues[0][i0], testValues[1][i1], testValues[2][i2], test->name);
    break;
  default:
    printf("Unknown number of variables");
    exit(-1);
  }
  t.points = t.errors ? t.errors > 1 || test->argc == 0 ? 0.0 : 0.5 : 1.0;
  return t;
}

// Main loop for running tests.
// 2 phases, eh, it's alright if it's a bit unoptamized for the number of strcmp's
// Phase 1 is testing each element.
// Phase 2 is displaying a score for each function.
// Then is just a final score.
void runTests(){
  int i, max = 0;
  double total = 0.0;
  TestOutput* results = malloc(sizeof(TestOutput)*functionCount);

  for(i = 0; i < functionCount; i++) {
    if (functionName == NULL || !strcmp(test_set[i].name,functionName)) {
      results[i] = testFunction(&test_set[i]);
    }
  }
  printf(" Score\tErrors\tFunction\n");
  for(i = 0; i < functionCount; i++) {
    if (functionName == NULL || !strcmp(test_set[i].name,functionName)) {
      double score = results[i].points * test_set[i].points;
      total += score;
      max += test_set[i].points;
      printf(" %.1f/%d\t%d\t%s\n", score, test_set[i].points, results[i].errors, test_set[i].name);
    }
  }
  printf("Total: %.1f/%d\n", total, max);
  free(results);
}

// Parses args, initializeTestSet, then runTests.  That's all there is to it.
int main(int argc, char** argv){
  char opt;
  
  while ((opt = getopt(argc, argv, "hf:")) != -1) {
    switch (opt) {
    case 'f':
      functionName = strdup(optarg);
      break;
    case 'h':
    case '?':
    default:
      displayHelp(argv[0]);
    }
  }
  // Must pass before runTests()
  if(!initializeTestSet())
    displayHelp(argv[0]);
  
  runTests();
  return 0;
}
