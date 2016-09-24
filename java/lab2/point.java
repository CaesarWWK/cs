public class point<T>{
   private T xpos;
   private T ypos;//generic variables can contains different types of data

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
  return this.ypos;//mutators
}
public void setx(T x)
{
  this.xpos=x;
}
public void sety(T y)
{
  this.ypos=y;//accessors
}

public String toString()
{
  return("The x position of point is"+getx()+" and the y position is "+gety());
}

}
