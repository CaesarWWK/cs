public class bonus{
  public static void main(String[] args) {
    point a=new point(2,3);
    point b=new point(5,1);
    point c=new point(1,4);
    point test=new point(1.5,3.5);
    triangle2d tri1=new triangle2d(a,b,c);
      System.out.println("The area of triangle is "+tri1.getarea());
        if(tri1.contains(test))
        {
          System.out.println("The triangle contains the point");
        }else
         {
           System.out.println("The triangle does not contain the point");
         }//if the point is inside the triangle
    triangle2d tri2=new triangle2d(new point(1,2),new point(3,1),new point(1,1));
      if(tri1.contains(tri2))
      {
        System.out.println("The triangle A contains the Triangle B");
      }else
      {
        System.out.println("The triangle A does not contain the Triangle B");
      }//if the triangle is inside another triangle

    }
  }
