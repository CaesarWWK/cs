public class Rectangle2D{
  private double[][] points;
  private double width;
  private double height;
  private double xmid;
  private double ymid;

  public Rectangle2D(double[][] input){
        points=new double[5][2];
        double xmin=input[0][0];
        double xmax=input[0][0];
        double ymin=input[0][1];
        double ymax=input[0][1];
        for(int n=0;n<5;n++){
         for(int i=0;i<2;i++){
          points[n][i]=input[n][i];
          if(i==0){
            if(input[n][i]>xmax){
              xmax=input[n][i];
            }
            if(input[n][i]<xmin){
              xmin=input[n][i];
            }
          }
          if(i==1){
            if(input[n][i]>ymax){
              ymax=input[n][i];
            }
            if(input[n][i]<ymin){
              ymin=input[n][i];
            }
          }
        }
      }

       xmid=(xmax-xmin)/2+xmin;
       ymid=(ymax-ymin)/2+ymin;
       width=xmax-xmin;
       height=ymax-ymin;//calculate the midpoint, width and height.

  }

  public double getwidth(){
    return this.width;
  }
  public double getheight(){
    return this.height;
  }
  public double getxmid(){
    return this.xmid;
  }
  public double getymid(){
    return this.ymid;
  }
  public double getArea(){
    return width*height;
  }
  public double getPermeter(){
    return (width+height)*2;
  }//accessor



}
