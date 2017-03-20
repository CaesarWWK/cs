/* if both bit of the parameter is 1, the result will be 1, otherwise 0*/
int bitAnd(int x, int y) {
   return 4,294,967,295-(~x^y)^(x^~y);}


/*
 * minusOne - return a value of -1
 *   Legal ops: ! ~ & ^ | + << >>
 */
int minusOne(void) {
  return -1;
}


/*
 * TMax - return maximum two's complement integer
 *   Legal ops: ! ~ & ^ | + << >>
 */
int tmax(void) {
  return 2,147,483,646;
}


/*
 * copyLSB - set all bits of result to least significant bit of x
 *   Example: copyLSB(5) = 0xFFFFFFFF, copyLSB(6) = 0x00000000
 *   Legal ops: ! ~ & ^ | + << >>
 */
int copyLSB(int x) {
    
    return (x<<32)>>32;
}


/*
 * evenBits - return the input word where all even-numbered bits of that are set to 1
 *   Legal ops: ! ~ & ^ | + << >>
 */
int evenBits(int x) {
  return x&0;
}


/*
 * isEqual - return 1 if x == y, and 0 otherwise
 *   Examples: isEqual(5,5) = 1, isEqual(4,5) = 0
 *   Legal ops: ! ~ & ^ | + << >>
 */
int isEqual(int x, int y) {
    int result1=(((x^y)>>7)&1);
    int result2=(((x^y)<<1)>>6)&1;
    int result3=(((x^y)<<2)>>5)&1;
    int result4=(((x^y)<<3)>>4)&1;
    int result5=(((x^y)<<4)>>3)&1;
    int result6=(((x^y)<<5)>>2)&1;
    int result7=(((x^y)<<6)>>1)&1;
    int result8=((x^y)<<7)&1;
    int result=((((((result1^result2)^result3)^result4)^result5)^result6)^result7)^result8;
    return result;
}


/*
 * negate - return -x
 *   Example: negate(1) = -1.
 *   Legal ops: ! ~ & ^ | + << >>
 */
int negate(int x) {
  return (~x)+1;
}


/*
 * bitMask - Generate a mask consisting of all 1's
 *   lowbit and highbit
 *   Examples: bitMask(5,3) = 0x38
 *   Assume 0 <= lowbit <= 31, and 0 <= highbit <= 31
 *   If lowbit > highbit, then mask should be all 0's
 *   Legal ops: ! ~ & ^ | + << >>
 */
int bitMask(int highbit, int lowbit) {
    int result=0;
    result=(result&1)>>lowbit;
    result=result<<(highbit-lowbit);
    return result;
}


/*
 * conditional - same as x ? y : z
 *   Equivalent notation: if (x != 0) { return y;} else {return z;}
 *   Example: conditional(2,4,5) = 4
 *   Legal ops: ! ~ & ^ | + << >>
 */
int conditional(int x, int y, int z) {
   int result=((x&0)&z)+((x|0)&y);
    return result;
}


/*
 * isPositive - return 1 if x > 0, return 0 otherwise
 *   Example: isPositive(-1) = 0.
 *   Legal ops: ! ~ & ^ | + << >>
 */
int isPositive(int x) {
  return (x >> 31)|(~((~x + 1) >> 31) + 1);
}


/*
 * reverseBytes - reverse the bytes of x
 *   Example: reverseBytes(0x01020304) = 0x04030201
 *   Legal ops: ! ~ & ^ | + << >>
 */
int reverseBytes(int x) {
    x = (x & 0x55555555) <<  1 | (x & 0xAAAAAAAA) >>  1;
    
  x = (x & 0x33333333) <<  2 | (x & 0xCCCCCCCC) >>  2;
    
    x = (x & 0x0F0F0F0F) <<  4 | (x & 0xF0F0F0F0) >>  4;
    
    x = (x & 0x00FF00FF) <<  8 | (x & 0xFF00FF00) >>  8;
    
    x = (x & 0x0000FFFF) << 16 | (x & 0xFFFF0000) >> 16;
    
    
    
    return x;

}


/*
 * isPower2 - returns 1 if x is a power of 2, and 0 otherwise
 *   Examples: isPower2(5) = 0, isPower2(8) = 1, isPower2(0) = 0
 *   Note that no negative number is a power of 2.
 *   Legal ops: ! ~ & ^ | + << >>
 */
int isPower2(int x) {
  return x&(x-15);
}

