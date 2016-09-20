public class point<T>{
   private T xpos;
   private T ypos;

  public point(T x,T y)
{
  this.xpos=x;
  this.ypos=y;
}


public point(){}
public T getx()
{
  return this.xpos;
}
public T gety()
{
  return this.ypos;
}
public void setx(T x)
{
  this.xpos=x;
}
public void sety(T y)
{
  this.ypos=y;
}

public String toString()
{
  return("The x position of point is"+getx()+" and the y position is "+gety());
}

}
