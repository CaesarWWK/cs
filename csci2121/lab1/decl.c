#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

#include "testFramework.h"
#include "lab1.h"

test_rec test_set[] = {
 {"bitAnd", (function_t) bitAnd, (function_t) test_bitAnd, 2, 1,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"minusOne", (function_t) minusOne, (function_t) test_minusOne, 0, 1,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"tmax", (function_t) tmax, (function_t) test_tmax, 0, 1,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"copyLSB", (function_t) copyLSB, (function_t) test_copyLSB, 1, 2,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"evenBits", (function_t) evenBits, (function_t) test_evenBits, 1, 2,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"isEqual", (function_t) isEqual, (function_t) test_isEqual, 2, 2,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"negate", (function_t) negate, (function_t) test_negate, 1, 2,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"bitMask", (function_t) bitMask, (function_t) test_bitMask, 2, 3,
  {{0, 31},{0,31},{INT_MIN,INT_MAX}}},
 {"conditional", (function_t) conditional, (function_t) test_conditional, 3, 3,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"isPositive", (function_t) isPositive, (function_t) test_isPositive, 1, 3,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"reverseBytes", (function_t) reverseBytes, (function_t) test_reverseBytes, 1, 3,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"isPower2", (function_t) isPower2, (function_t) test_isPower2, 1, 4,
  {{INT_MIN, INT_MAX},{INT_MIN,INT_MAX},{INT_MIN,INT_MAX}}},
 {"", NULL, NULL, 0, 0, {{0,0},{0,0},{0,0}}}
};
