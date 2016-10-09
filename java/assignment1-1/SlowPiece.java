public class SlowPiece extends Piece{
  public SlowPiece(String n,String c,int xpos,int ypos)
  {
    super(n,c,xpos,ypos);
    this.sett("Slow");
  }

   public void move(String a,int b){}

   public void move(String direction)
   {
      if(direction.equals("left"))
        {
          if(this.getx()<8&&this.gety()<8&&this.getx()>=0&&this.gety()>0)
            {
              this.sety(this.gety()-1);
              System.out.println("Move Complete");
            }
            else
                System.out.println("Out of Boundry") ;
        }

        if(direction.equals("right"))
          {
            if(this.getx()<8&&this.gety()<7&&this.getx()>=0&&this.gety()>=0)
              {
                this.sety(this.gety()+1);
                System.out.println("Move Complete");
              }
            else
                System.out.println("Out of Boundry");
           }
           if(direction.equals("up")||direction.equals("down"))
           {
             System.out.println("No such move");
           }
      }

  public String toString()
  {
     return(this.getname()+this.getcolor()+"S");
  }



}
