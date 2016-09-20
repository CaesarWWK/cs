import java.util.Scanner;
import java.io.*;
public class FileReadDemo{
public static void main(String[] args) throws IOException{
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter the filename to read from: ");
String filename = keyboard.nextLine();
File file = new File(filename);
Scanner inputFile = new Scanner(file);
GenericStack<String> stack1 = new GenericStack<String>();
int i=0;
while (inputFile.hasNext()){
String line = inputFile.nextLine();
String remains=line.substring(line.indexOf(" "));
String lastname=remains.substring(0,line.indexOf(" "));
stack1.push(lastname);
i++;
}
inputFile.close();

for(;i>0;i--)
{
System.out.println(stack1.pop());
}
}}
