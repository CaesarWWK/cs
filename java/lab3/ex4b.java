import java.util.Scanner;
import java.lang.Math;
import java.io.*;
public class ex4b{
public static void main(String[] args) throws IOException{
  long startTime, endTime, executionTime;
  startTime = System.currentTimeMillis();//start timing

Scanner keyboard=new Scanner(System.in);


System.out.print("Enter a file name : ");

String filename = keyboard.nextLine();

File file = new File(filename);
Scanner inputFile = new Scanner(file);//code for reading a file

System.out.print("Enter a substring: ");
String b=keyboard.nextLine();
int times=0;
while (inputFile.hasNext())
  {
    String a = inputFile.nextLine();
    int count=1;
    int c=a.length();
    int d=b.length();
    for(int i=a.length();i>0;i--)
    {
      if(a.charAt(c-i)==b.charAt(0))
      {
        if(b.length()==1)//if the substring only has one char
          {
            times++;
          }
        for(int n=b.length()-1;n>0;n--)
        {
          count=1;
         if(a.length()>=(c-i+count+1)){
          if(b.charAt(d-n)!=a.charAt(c-i+count))/*check the string char by char, if there is one char
           different from substring, then break*/
          {
            break;
          }}
          count++;//if there is one char to be same, count ++

        }
        if(count==b.length()){times++;}/*if the count equals the length of the substring,
         that means every char in the substring is the same as the string */
      }
    }
  }
inputFile.close();
  if(times!=0)
    {
      System.out.println("Substring "+b+" was found "+times+" times");
    }else
      System.out.println("Substring "+b+" was not found ");

  endTime = System.currentTimeMillis();
  executionTime = endTime - startTime;
  System.out.print(executionTime);



}
}
