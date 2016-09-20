public class Rectangle{
  private double xpos;
  private double ypos;
  private double width;
  private double height;//announce the varibles

  public Rectangle(){
        xpos=0.0;
        ypos=0.0;
        width=0.0;
        height=0.0;
  }//default constractor

  public Rectangle(double xpos,double ypos,double width,double height){
      this.xpos=xpos;
      this.ypos=ypos;
      this.width=width;
      this.height=height;
  }//constractor of different varibles
  public void setxpos(double xpos){
    this.xpos=xpos;
  }
  public void setypos(double ypos){
    this.ypos=ypos;
  }
  public void setwidth(double width){
    this.width=width;
  }
  public void setheight(double height){
    this.height=height;
  }//mutator
  public double getwidth(){
    return this.width;
  }
  public double getheight(){
    return this.height;
  }
  public double getxpos(){
    return this.xpos;
  }
  public double getypos(){
    return this.ypos;
  }
  public double getArea(){
    return width*height;
  }
  public double getPermeter(){
    return (width+height)*2;
  }//accessor
  public boolean contains(double x,double y){
    if((x<=xpos+width)&&(x>=xpos)&&(y<=ypos+height)&&(y>=ypos)){
      return true;
    }
    return false;
  }//if the points is between its four endpoints, the rectangle contains the point.
  public boolean contains(Rectangle r)
  {
    if((r.getxpos()>=xpos)&&(r.getxpos()+r.getwidth()<=xpos+width)&&
    (r.getypos()>=ypos)&&(r.getypos()+r.getheight()<=ypos+height)){
      return true;
    }
      return false;
  }//if the rectangle B's four endpoints are all betwwen A's four endpoints, A contains B
  public boolean overlap(Rectangle r)
  {
    int n=0;
      if(this.contains(r.getxpos(),r.getypos())||this.contains(r.getxpos(),r.getypos()+r.getheight())
        ||this.contains(r.getxpos()+r.getwidth(),r.getypos())||this.contains(r.getxpos()+r.getwidth(),r.getypos()+r.getheight()))
          {
            n++;
           }
      if(this.contains(r.getxpos(),r.getypos())&&this.contains(r.getxpos(),r.getypos()+r.getheight())
     &&this.contains(r.getxpos()+r.getwidth(),r.getypos())&&this.contains(r.getxpos()+r.getwidth(),r.getypos()+r.getheight()))
        {
          n++;
        }
       if(n==1)
       {
       return true;
        }
       return false;/*if one of the endpoints of B is inside A, that means some part of B is inside A. But not four endpoints of B
       can be inside A at the same time*/
    }

}
