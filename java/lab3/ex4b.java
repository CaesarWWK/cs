import java.util.Scanner;
import java.lang.Math;
import java.io.*;
public class ex4b{
public static void main(String[] args) throws IOException{
  long startTime, endTime, executionTime;
  startTime = System.currentTimeMillis();

Scanner keyboard=new Scanner(System.in);


System.out.print("Enter a file name : ");

String filename = keyboard.nextLine();

File file = new File(filename);
Scanner inputFile = new Scanner(file);

System.out.print("Enter a substring: ");
String b=keyboard.nextLine();
int times=0;
while (inputFile.hasNext())
  {
    String a = inputFile.nextLine();

    int c=a.length();
    int d=b.length();
    for(int i=a.length();i>0;i--)
    {
      if(a.charAt(c-i)==b.charAt(0))
      {
        if(b.length()==1){times++;}
        for(int n=b.length()-1;n>0;n--)
        {
         int count=1;
         if(a.length()>=(c-i+count+1)){
          if(b.charAt(d-n)!=a.charAt(c-i+count))
          {
            break;
          }}
          count++;
        times++;
        }
      }
    }
  }
inputFile.close();
  System.out.println(times);


  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.print(executionTime);





}
}
