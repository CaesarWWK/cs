public class ex2{
public static void main(String[] args)
{
  point<Integer> point1 = new point<Integer>(10,20);
  point<Double> point2 = new point<Double>(14.5, 15.6);
  point<String> point3 = new point<String>("topleftx","toplefty");//generate different types of points by generics

  System.out.println(point1);
  System.out.println(point2);
  System.out.println(point3);
  }
}
