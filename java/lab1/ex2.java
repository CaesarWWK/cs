import java.util.Scanner;
public class ex2 {
  public static void main(String[] args) {
    double[][] points = new double[5][2];//crete a 2-D array
    Scanner input = new Scanner(System.in);
      System.out.print("Enter " + points.length + " points: ");
    for (int i = 0; i < points.length; i++)
      {
        points[i][0] = input.nextDouble();
        points[i][1] = input.nextDouble();
      }//take loops to input data

    Rectangle2D boundingRectangle =new Rectangle2D(points);
      System.out.println("The bounding rectangle's center (" +
      boundingRectangle.getxmid() + ", " +
      boundingRectangle.getymid() + "), width " +
      boundingRectangle.getwidth() + ", height " +
      boundingRectangle.getheight());
 }
}
