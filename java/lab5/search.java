import java.util.Scanner;
import java.lang.Math;
import java.io.*;
public class search{
public static void main(String[] args) throws IOException{

Scanner keyboard=new Scanner(System.in);
OrderedList<String> list1=new OrderedList<String>();

System.out.print("Enter a file name : ");

String filename1 = keyboard.nextLine();

File file1 = new File(filename1);
Scanner inputFile1 = new Scanner(file1);//code for reading a file



while (inputFile1.hasNext())
  {
   String a=inputFile1.nextLine();
   list1.insert(a);
  }
inputFile1.close();
list1.enumerate();



OrderedList<String> list2=new OrderedList<String>();

System.out.print("Enter a file name : ");

String filename2 = keyboard.nextLine();

File file2 = new File(filename2);
Scanner inputFile2 = new Scanner(file2);//code for reading a file



while (inputFile2.hasNext())
  {
   String b=inputFile2.nextLine();
   list2.insert(b);
  }
inputFile2.close();
list2.enumerate();


OrderedList<String> list3=new OrderedList<String>();
int first=list1.size();
int second=list2.size();
list3.insert(list2.first());
list3.insert(list1.first());
if(second>first){
for(;first>1;first--)
{
  list3.insert(list2.next());
  list3.insert(list1.next());
}
for(int n=list2.size()-list1.size();n>0;n--)
{
  list3.insert(list2.next());
}
}
else{
 first=list1.size();
 second=list2.size();

  for(;second>1;second--)
  {
    list3.insert(list2.next());
    list3.insert(list1.next());
  }
  for(int n=list1.size()-list2.size();n>0;n--)
  {
    list3.insert(list1.next());
  }
}
list3.enumerate();

}
}
