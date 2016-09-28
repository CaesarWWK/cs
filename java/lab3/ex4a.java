import java.util.Scanner;
import java.lang.Math;
public class ex4a{
public static void main(String[] args){


Scanner keyboard=new Scanner(System.in);

System.out.print("Enter a String : ");
String a=keyboard.nextLine();
System.out.print("Enter a substring: ");
String b=keyboard.nextLine();
int c=a.length();
int d=b.length();
String result="";
for(int i=a.length();i>0;i--)
{
  if(a.charAt(c-i)==b.charAt(0))
  {
    if(b.length()==1){result+=" "+(c-i);}
    for(int n=b.length()-1;n>0;n--)
    {
     int count=1;
      if(b.charAt(d-n)!=a.charAt(c-i+count))
      {
        break;
      }
      count++;
      result+=" "+(c-i);
    }
  }
}
if(result.equals(" ")){
  System.out.print("No matches - substring "+b+" was not found in "+a);
}
else   System.out.print("Substring "+b+" was found in "+a+" at indices :"+result);


}
}
