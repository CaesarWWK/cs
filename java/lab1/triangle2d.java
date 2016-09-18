public class triangle2d{
  private point p1=new point();
  private point p2=new point();
  private point p3=new point();

  public triangle2d(point a,point b,point c){
    p1.setx(a.getx());
    p2.setx(b.getx());
    p3.setx(c.getx());
    p1.sety(a.gety());
    p2.sety(b.gety());
    p3.sety(c.gety());
  }//constractor
  public double getarea(){
    double side1=p1.findlength(p2);
    double side2=p2.findlength(p3);
    double side3=p3.findlength(p1);
    double s=(side1+side2+side3)/2;
    double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
  }//calculate the area by using the formular
  public double getperimeter(){
    double side1=p1.findlength(p2);
    double side2=p2.findlength(p3);
    double side3=p3.findlength(p1);
    double p=side1+side2+side3;
    return p;
  }//calculate the perimeter
  public point getp1()
  {
    return p1;
  }
  public point getp2()
  {
    return p2;
  }
  public point getp3()
  {
    return p3;
  }//accessor

  public boolean contains(point p){
    double k1,k2,k,kmax,kmin;
    int n=0;
      k=(p.gety()-p1.gety())/(p.getx()-p1.getx());
      k1=(p2.gety()-p1.gety())/(p2.getx()-p1.getx());
      k2=(p3.gety()-p1.gety())/(p3.getx()-p1.getx());
    if(k1>k2)
    {
     kmax=k1;
     kmin=k2;
    }else
    {
      kmax=k2;
      kmin=k1;
       }
    if((k<=kmax)&&(k>=kmin))
    {
      n++;
    }
    k1=0;
    k2=0;
    k=0;/*if the slope of the line which defined by the point and
    one of the endpoint is between each two side of triangle, the point must be in the area
    decided by these two side. By repeating the procedure for 3 times, the location of the point
    will be known*/


   k=(p.gety()-p2.gety())/(p.getx()-p2.getx());
   k1=(p1.gety()-p2.gety())/(p1.getx()-p2.getx());
   k2=(p3.gety()-p2.gety())/(p3.getx()-p2.getx());
    if(k1>k2)
    {
     kmax=k1;
     kmin=k2;
    }else
    {
      kmax=k2;
      kmin=k1;
    }
    if((k<=kmax)&&(k>=kmin))
    {
      n++;
    }
    k1=0;
    k2=0;
    k=0;//second time

    k=(p.gety()-p3.gety())/(p.getx()-p3.getx());
    k1=(p1.gety()-p3.gety())/(p1.getx()-p3.getx());
    k2=(p2.gety()-p3.gety())/(p2.getx()-p3.getx());
      if(k1>k2)
    {
      kmax=k1;
      kmin=k2;
    }else
    {
      kmax=k2;
      kmin=k1;
    }
     if((k<=kmax)&&(k>=kmin))
     {
       n++;
     }//third time


    if(n==3){
      return true;
    }
     return false;//if the point satisfy all 3 condintion, we can say the point must be inside the triangle
    }

    public boolean contains(triangle2d b)
    {
      if(this.contains(b.getp1())&&this.contains(b.getp2())&&this.contains(b.getp3()))
      {
           return true;
      }
      return false;
    }
 }
