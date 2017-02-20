/*
 * CSCI 2121 Lab 1: Bit Slinging
 */

// Variable function pointers.
// Sets the return type.
typedef int (*function_t)(void);
// Sets the number of functions.  Should match argc.
typedef int (*function1_t)(int);
typedef int (*function2_t)(int, int);
typedef int (*function3_t)(int, int, int);

// The structure sets the functions that should be tested on.
typedef struct {
    char *name;
    function_t lab_function;
    function_t test_function;
    int argc;
    int points;
    int arg_ranges[3][2]; /* Min & Max values for each argument */
} test_rec, *test_ptr;

extern test_rec test_set[];
