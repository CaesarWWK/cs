import java.util.Scanner;
import java.lang.Math;
public class ex1{
public static void main(String[] args){
long startTime, endTime, executionTime;
startTime = System.currentTimeMillis();
//include the code snippet (or call to the method) here
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
Scanner keyboard=new Scanner(System.in);
System.out.print("Enter the degree of polynomial: ");
int x=keyboard.nextInt();
System.out.print("Enter the value of x: ");
int y=keyboard.nextInt();
int total=0;
for(;x>=0;x--){
  total+=Math.pow(y,x);
}
System.out.print(total);
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
System.out.print(executionTime);
}
}
