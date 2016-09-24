import java.util.Scanner;
public class ex1{
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(0,0,2.0,2.0) ;
    circle2d circle1 = new circle2d(1,1,1);
    int n=0;
    System.out.print("Please input the number of points");
    Scanner input = new Scanner(System.in);
    n=input.nextInt();
        int c =0;
      double i=0;//count the number of points inside the circle and outside the circle

    for(;c<n;c++)
      {
        point<Double> points=new point<Double>((double)(2*Math.random()),(double)(2*Math.random()));

        if(circle1.contains(points))
          {
            i++;
          }
      }//loop to generate all points and test them
        double count=c;

        System.out.print(4.0*i/c);
   }
 }
