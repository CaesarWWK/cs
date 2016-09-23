public class point{
   private double xpos;
   private double ypos;

  public point(double x,double y)
{
  this.xpos=x;
  this.ypos=y;
}


public point(){}
public double getx()
{
  return this.xpos;
}
public double gety()
{
  return this.ypos;
}
public void setx(double x)
{
  this.xpos=x;
}
public void sety(double y)
{
  this.ypos=y;
}

public String toString()
{
  return("The x position of point is"+getx()+" and the y position is "+gety());
}

}
