public class point{
   private double x;
   private double y;

   public point(){
     x=0;
     y=0;
   }
   public point(double x,double y){
     this.x=x;
     this.y=y;
   }
   public void setx(double x){
     this.x=x;
   }
   public void sety(double y){
     this.y=y;
   }
   public double getx(){
     return x;
   }
   public double gety(){
     return y;
   }
   public double findlength(point another){
     return Math.sqrt((another.getx()-this.x)*(another.getx()-this.x)+(another.gety()-this.y)*(another.gety()-this.y));
   }//find the length of the lie between one point with another point

}
