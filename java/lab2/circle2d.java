public class circle2d{
  private double x;
  private double y;
  private double radius;

  public circle2d(){
    y=0;
    y=0;
    radius=1;
  }
  public circle2d(double x,double y,double radius ){
    this.x=x;
    this.y=y;
    this.radius=radius;
  }//constractor
  public void setx(double x){
    this.x=x;
  }
  public void sety(double y){
    this.y=y;
  }
  public void setradius(double radius){
    this.radius=radius;
  }//mutator
  public double getradius(){
    return this.radius;
  }
  public double getx(){
    return this.x;
  }
  public double gety(){
    return this.y;
  }
  public double getarea(){
    return this.radius*this.radius*Math.PI;
  }
  public double getperimeter(){
    return 2*this.radius*Math.PI;
  }//accessor
  public boolean contains(point x){
    double a=(double)x.getx();
    double b=(double)x.gety();
    if((a-this.x)*(a-this.x)+(b-this.y)*(b-this.y)>(this.radius*this.radius))
    { return false;
    }
    return true;
  }
  public boolean contains(double x,double y){
    if((x-this.x)*(x-this.x)+((y-this.y)*(y-this.y))>(this.radius*this.radius)){
      return false;
    }
    return true;
  }//if the circle contains the point
  public boolean contains(circle2d circle){
    if((circle.getx()-this.x)*(circle.getx()-this.x)+((circle.gety()-this.y)*(circle.gety()-this.y))<=(circle.getradius()-this.radius)*(circle.getradius()-this.radius)){
      return true;
    }
     return false;
  }//if the circle contains another circle
  public boolean overlap(circle2d circle){
    if((circle.getx()-this.x)*(circle.getx()-this.x)+((circle.gety()-this.y)*(circle.gety()-this.y))<=(circle.getradius()+this.radius)*(circle.getradius()+this.radius)){
      return true;
    }
     return false;
  }//if an circle overlap another circle
}
