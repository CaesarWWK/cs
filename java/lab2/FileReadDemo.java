import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
public class FileReadDemo{
  public static void main(String[] args) throws IOException{

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the filename to read from: ");
    String filename = keyboard.nextLine();
    StringTokenizer token;
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);//crete file reader
    GenericStack<StudentRecord> stack1 = new GenericStack<StudentRecord>();
      int i=0;

      while (inputFile.hasNext())
        {
          String line = inputFile.nextLine();
          token = new StringTokenizer(line, " ");
          String f = token.nextToken();
          String l = token.nextToken();
          String bString = token.nextToken();
          StudentRecord stu=new StudentRecord(f,l,Integer.parseInt(bString));
          stack1.push(stu);//use StringToken to divide the line into 3 part. And push only the Last names to stack1
          i++;
        }
      inputFile.close();
      int c=i;
      GenericStack<String> stack2 = new GenericStack<String>();
      for(;i>0;i--)
        {
          stack2.push(stack1.pop().gets());
        }

      for(;c>0;c--)
        {
          System.out.println(stack2.pop());
        }


  }
}
