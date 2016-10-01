import java.util.Scanner;
import java.lang.Math;
public class ex3{
  public static void main(String[] args){
    long startTime, endTime, executionTime;
    startTime = System.currentTimeMillis();
    //include the code snippet (or call to the method) here

    Scanner keyboard=new Scanner(System.in);
    System.out.print("Enter the value of n: ");
      int y=keyboard.nextInt();
      int total=(int)Math.pow(2,y);
       System.out.println(total);//calculate the total numbers of binary numbers
   for(;total>0;total--)
    {
      String sb = Integer.toBinaryString(total);//create the binary numbers
    }

    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.print("Execution time to generate 2^"+y+" binary numbers: "+executionTime+"  millisecs");

  }
}
