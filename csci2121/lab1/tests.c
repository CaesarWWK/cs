/* Testing Code */

//#include <limits.h>
#define LONG_MIN 0x80000000
#define LONG_MAX 0x7fffffff
int test_bitAnd(int x, int y)
{
  return x&y;
}
int test_minusOne(void) {
  return -1;
}
int test_tmax(void) {
  return LONG_MAX;
}
int test_copyLSB(int x)
{
  return (x & 0x1) ? -1 : 0;
}
int test_evenBits(int x) {
  int result = 0;
  int i;
  for (i = 0; i < 32; i+=2)
    result |= 1<<i;
  result = x & result;
  return result;
}
int test_isEqual(int x, int y)
{
  return x == y;
}
int test_negate(int x) {
  return -x;
}
int test_bitMask(int highbit, int lowbit)
{
  int result = 0;
  int i;
  for (i = lowbit; i <= highbit; i++)
    result |= 1 << i;
  return result;
}
int test_conditional(int x, int y, int z)
{
  return x?y:z;
}
int test_isPositive(int x) {
  return x > 0;
}
int test_reverseBytes(int x)
{
  union U {
    int result;
    char byte[4];
  };
  union U u;
  int temp;
  u.result = x;
  temp = u.byte[0];
  u.byte[0] = u.byte[3];
  u.byte[3] = temp;
  temp = u.byte[1];
  u.byte[1] = u.byte[2];
  u.byte[2] = temp;
  return u.result;
}
int test_isPower2(int x) {
  int i;
  for (i = 0; i < 31; i++) {
    if (x == 1<<i)
      return 1;
  }
  return 0;
}
