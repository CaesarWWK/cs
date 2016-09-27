public class ex2{
public static void main(String[] args)
{
  point<Integer> point1 = new point<Integer>(113,224);
  point<Double> point2 = new point<Double>(1333.5, 2.226);
  point<String> point3 = new point<String>("C","++");//generate different types of points by generics

  System.out.println(point1);
  System.out.println(point2);
  System.out.println(point3);
  }
}
