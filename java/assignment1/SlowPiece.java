public class SlowPiece extends Piece{
  public SlowPiece(String n,String c,int xpos,int ypos)
  {
 super(n,c,xpos,ypos);  
  }
  
      
   public boolean move(String direction)
   {

      if(direction=="left")
      { if(this.getx()<=8&&this.gety()<=8)
        {
          this.setx(this.getx()-1);
          return true;
        }else return false;       }
        if(direction=="right")
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
