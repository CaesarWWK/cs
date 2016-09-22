public class FastPiece extends Piece{
   public FastPiece(String n,String c,int xpos,int ypos)
  {
 super(n,c,xpos,ypos);  
  }
   public boolean move(String direction,int d)
   {

      if(direction=="left")
      { if(this.getx()<=8&&this.gety()<=8)
        {
          this.setx(this.getx()-d);
          return true;
        }else return false;       }
        if(direction=="right")
        {
          if(this.getx()<=8&&this.gety()<=8)
          {
            this.setx(this.getx()-d);
            return true;
          }
        }else return false;

      return true;}
  public String toString()
  {
     return(this.getname()+this.getcolor()+"F");
  }
}
