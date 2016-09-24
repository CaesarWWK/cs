abstract class Piece{
  private String name;
  private String color;
  private String type;
  private int xpos;
  private int ypos;

  public Piece(String n,String c,int xpos,int ypos)
  {
    this.name=n;
    this.color=c;
    this.xpos=xpos;
    this.ypos=ypos;
  }
  public void setname(String n)
  {
    this.name=n;
  }
  public void setcolor(String c)
  {
    this.color=c;
  }
  public void setx(int x)
  {
    this.xpos=x;
  }
  public void sety(int y)
  {
    this.ypos=y;
  }
  public String gett()
  {
    return this.type;
  }
  public void sett(String x)
  {
    this.type=x;
  }

  public String getname()
  {
    return this.name;
  }
  public String getcolor()
  {
    return this.color;
  }
  public int getx()
  {
    return this.xpos;
  }

  public int gety()
 {
   return this.ypos;
 }
 abstract void move(String a,int b);
 abstract void move(String a);


}
