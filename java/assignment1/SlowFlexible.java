public class SlowFlexible extends SlowPiece{

    public SlowFlexible(String n,String c,int xpos,int ypos)
  {
 super(n,c,xpos,ypos);
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


   if(direction.equals("up"))
   { if(this.getx()<=8&&this.gety()<=8)
     {
       this.sety(this.gety()-1);
       return true;
     }else return false;       }
     if(direction.equals("down"))
     {
       if(this.getx()<=8&&this.gety()<=8)
       {
         this.sety(this.gety()+1);
         return true;
       }
     }else return false;



   return true;
}
public String toString()
{
   return(this.getname()+this.getcolor()+"SF");
}
}
