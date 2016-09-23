public class FastFlexible extends FastPiece{

 public FastFlexible(String n,String c,int xpos,int ypos)
  {
 super(n,c,xpos,ypos);
  }

   public boolean move(String direction,int d)
   {

      if(direction.equals("left"))
      { if(this.getx()<=8&&this.gety()<=8)
        {
          this.setx(this.getx()-d);
          return true;
        }else return false;       }
        if(direction.equals("right"))
        {
          if(this.getx()<=8&&this.gety()<=8)
          {
            this.setx(this.getx()+d);
            return true;
          }
        }else return false;


   if(direction.equals("up"))
   { if(this.getx()<=8&&this.gety()<=8)
     {
       this.sety(this.gety()-d);
       return true;
     }else return false;       }
     if(direction.equals("down"))
     {
       if(this.getx()<=8&&this.gety()<=8)
       {
         this.sety(this.gety()+d);
         return true;
       }
     }else return false;



   return true;
}
public String toString()
{
   return(this.getname()+this.getcolor()+"FF");
}
}
