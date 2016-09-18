public class ex3{
  public static void main(String[] args) {
    circle2d c1=new circle2d(4.0,5.0,6.5);
      System.out.println("The area of the rectangle is "+c1.getarea());
      if(c1.contains(5.0,2.1))
      {
        System.out.println("The rectangle contains the point" );
      }else
       {
         System.out.println("The rectangle does not contain the point" );
       }//if the circle contains the point
      if(c1.contains(new circle2d(3.0,1.0,5.5)))
      {
        System.out.println("The rectangle A contains the Rectangle B" );
      }else
      {
        System.out.println("The rectangle A does not contain the Rectangle B" );
      }//if the rectangle A contains Rectangle B
      if(c1.overlap(new circle2d(4.0,7.0,1.5)))
      {
        System.out.println("The rectangle A overlap the Rectangle B" );
      }else
      {
        System.out.println("The rectangle A does not overlap the Rectangle B" );
      }//if the rectangle A overlaps Rectangle B
    }
  }
