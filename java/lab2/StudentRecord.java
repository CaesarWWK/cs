public class StudentRecord{
  private String firstname;
  private String lastname;
  private int bannerID;

  public StudentRecord(String f,String l,int b){
    this.firstname=f;
    this.lastname=l;
    this.bannerID=b;//constractor
  }
  public void setf(String f)
  {
    this.firstname=f;
  }
  public void sets(String s)
  {
    this.lastname=s;
  }
  public void setb(int b)
  {
    this.bannerID=b;//mutators
  }
  public String getf()
  {
    return this.firstname;
  }
  public String gets()
  {
    return this.lastname;
  }
  public int getb()
  {
    return this.bannerID;//accessors
  }

   public String toString()
   {
     return (this.getf()+" "+this.gets()+"  "+this.getb());
   }



}
