public class ex1{
  public static void main(String[] args) {
    Rectangle rect1;
    rect1=new Rectangle(2.0,2.0,5.5,4.9);//create the new rectangle object
    System.out.println("The area is"+rect1.getArea()+"  The perimeter is "+rect1.getPermeter());//call the area method
      if(rect1.contains(3,3))
        {
          System.out.println("It contains the point (3,3)");
        }else
        {
          System.out.println("It does not contains the point (3,3)");
        }//call the contains method
      if(rect1.contains(new Rectangle(3,2,4,3.2)))
        {
          System.out.println("It contains the rectangle");
        }else
        {
          System.out.println("It does not contains the rectangle");
        }//overload of contains method
       if(rect1.overlap(new Rectangle(1,2,13,5)))
       {
         System.out.println("It overlap the rectangle");
       }else
       {
         System.out.println("It does not overlap the rectangle");
       }//call the overlap method

  }
}
