import java.util.Scanner;
public class ex1{
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(0,0,2.0,2.0) ;
    circle2d circle1 = new circle2d(1,1,1);
    int n=0;
    System.out.print("Please input the number of points");
    Scanner input = new Scanner(System.in);
    n=input.nextInt();
    point[] points=new point[n];
    
      for(int c=0;c<n;c++)
    {
      points[c]=(new point((int)(3*Math.random()),(int)(3*Math.random())));
          }
     int i=0;
     for(;n>0;n--)
     {
       if(circle1.contains(points[n-1]))
       {
         i++;
       }
     }
     System.out.print(i);
   }}
