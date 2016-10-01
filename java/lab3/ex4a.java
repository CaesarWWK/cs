import java.util.Scanner;
import java.lang.Math;
public class ex4a{
public static void main(String[] args){


Scanner keyboard=new Scanner(System.in);

System.out.print("Enter a String : ");
String a=keyboard.nextLine();
System.out.print("Enter a substring: ");
String b=keyboard.nextLine();
int c=a.length();//save the length of the String
int d=b.length();
String result="";
for(int i=a.length();i>0;i--)//first loop --O(n)
  if(a.charAt(c-i)==b.charAt(0))
  {
    if(b.length()==1)
      {
        result+=" "+(c-i);//if the substring only has one char,
      }else {
    for(int n=b.length()-1;n>0;n--)//second loop --O(n) So the total complexity is O(n*n)=O(n2)
    {
     int count=1;//for counting
      if(b.charAt(d-n)!=a.charAt(c-i+count))
      {
        break;//check the string A char by char, if there is one char different from string B, end the loop
      }
      count++;
      result+=" "+(c-i);
    } }
  }
}
  if(result.equals(" "))
  {
    System.out.print("No matches - substring "+b+" was not found in "+a);
  }
  else
    System.out.print("Substring "+b+" was found in "+a+" at indices :"+result);//output the result


}
}
