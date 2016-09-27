public class FastFlexible extends FastPiece{

 public FastFlexible(String n,String c,int xpos,int ypos)
  {
    super(n,c,xpos,ypos);
    this.sett("FastFlexible");
  }

   public void move(String direction,int d)
    {
      System.out.print("sdd");
      if(direction.equals("left"))
      {
        if(this.getx()<8&&this.gety()<8&&this.getx()>=0&&this.gety()>=d)
          {
            this.sety(this.gety()-d);
            System.out.println("Move Complete");
          }
            else
              System.out.println("Out of Boundry");
        }

        if(direction.equals("right"))
          {
              if(this.getx()<8&&this.gety()<8-d&&this.getx()>=0&&this.gety()>=0)
                {
                    this.sety(this.gety()+d);
                    System.out.println("Move Complete");
                }
              else
                System.out.println("Out of Boundry");
          }

          if(direction.equals("up"))
            {
               if(this.getx()<8&&this.gety()<8&&this.getx()>=d&&this.gety()>=0)
                  {
                    this.setx(this.getx()-d);
                    System.out.println("Move Complete");
                  }
                  else
                    System.out.println("Out of Boundry");
              }
          if(direction.equals("down"))
            {
              if(this.getx()<8-d&&this.gety()<8&&this.getx()>=0&&this.gety()>=0)
                {
                  this.setx(this.getx()+d);
                  System.out.println("Move Complete");
                }
              else
                System.out.println("Out of Boundry");
          }

      }


      public String toString()
      {
        return(this.getname()+this.getcolor()+"FF");
      }



      
}
