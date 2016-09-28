import java.util.Scanner;
import java.lang.Math;
public class ex1{
  public static void main(String[] args){
    long startTime, endTime, executionTime;
    startTime = System.currentTimeMillis();

    Scanner keyboard=new Scanner(System.in);
    System.out.print("Enter the degree of polynomial: ");
      int x=keyboard.nextInt();
    System.out.print("Enter the value of x: ");
      int y=keyboard.nextInt();
      int total=0;

    for(;x>=0;x--)
      {
        total+=Math.pow(y,x);
      }
    System.out.println("The polynomial evaluates to: "+total);
  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.print("Execution time to evaluate polynomial of degree 10: "+executionTime+" millisecs");
  }
}
