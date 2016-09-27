public class FastPiece extends Piece{
   public FastPiece(String n,String c,int xpos,int ypos)
    {
      super(n,c,xpos,ypos);
      this.sett("Fast");
    }

   public void move(String direction) {}
   public void move(String direction,int d)
    {
      if(direction.equals("left"))
        {
           if(this.getx()<8&&this.gety()<8&&this.getx()>=0&&this.gety()>=d)
            {
              this.sety(this.gety()-d);
              System.out.println("Move Complete");
            }
            else
              {
                System.out.print("Out of Boundry");
               }
        }

      if(direction.equals("right"))
        {
            if(this.getx()<8&&this.gety()<(8-d)&&this.getx()>=0&&this.gety()>=0)
              {
                  this.sety(this.gety()+d);
                  System.out.println("Move Complete");
              }
              else
                {
                  System.out.print("Out of Boundry");
                }
          }

    }

  public String toString()
  {
     return(this.getname()+this.getcolor()+"F");
  }



  
}
