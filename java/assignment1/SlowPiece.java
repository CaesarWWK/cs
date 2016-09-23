public class SlowPiece extends Piece{
  public SlowPiece(String n,String c,int xpos,int ypos)
  {
 super(n,c,xpos,ypos);
  }
   public boolean move(String a,int b)
   {
     return false;
     }

   public boolean move(String direction)
   {

      if(direction.equals("left"))
      { if(this.getx()<=8&&this.gety()<=8)
        {
          this.setx(this.getx()-1);
          return true;
        }else return false;       }
        if(direction.equals("right"))
        {
          if(this.getx()<=8&&this.gety()<=8)
          {
            this.setx(this.getx()+1);
            return true;
          }
        }else return false;

     return true;}
  public String toString()
  {
     return(this.getname()+this.getcolor()+"S");
  }
}
