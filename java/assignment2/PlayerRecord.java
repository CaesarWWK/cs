public class PlayerRecord{
  private String name;
  private String position;
  private String team;
  private int gp;
  private int g;
  private int a;
  private int pim;
  private int sog;
  private int gwg;
  private int P;
  private double PG;
  private double PCT;

public PlayerRecord(){}
public PlayerRecord(String n;String p;String t;int gp;int g;int a;int pim;int sog;int gwg)
  {
    this.name=n;
    this.position=p;
    this.team=t;
    this.gp=gp;
    this.g=g;
    this.a=a;
    this.pim=pim;
    this.sog=sog;
    this.gwg=gwg;
  }
  public String getname()
  {
    return this.name;
  }
  public String getposition()
  {
    return this.position;
  }
  public String getteam()
  {
    return this.team;
  }
  public int getgp()
  {
    return this.gp;
  }
  public int getg()
  {
    return this.g;
  }
  public String geta()
  {
    return this.a;
  }
  public int getpim()
  {
    return this.pim;
  }
  public int getsog()
  {
    return this.sog;
  }
  public int getgwg()
  {
    return this.gwg;
  }
  public int getP()
  {
    return this.P;
  }
  public double getPG()
  {
    return this.PG;
  }
  public double getPCT()
  {
    return this.PCT;
  }





  public void setname(String name)
  {
    this.name=name;
  }
  public void setposition(String position)
  {
   this.position=position;
  }
  public void setteam(String team)
  {
   this.team=team;
  }
  public void setgp(int gp)
  {
    this.gp=gp;
  }
  public void setg(int g)
  {
    this.g=g;
  }
  public void seta(int a)
  {
    this.a=a;
  }
  public void setpim(int pim)
  {
   this.pim=pim;
  }
  public void setsog(int sog)
  {
    this.sog=sog;
  }
  public void setgwg(int gwg)
  {
    this.gwg=gwg;
  }
  public void setP()
  {
    this.P=this.getg()+this.geta();
  }
  public void setPG()
  {
    this.PG=this.getP()/this.getgp();
  }
  public void setPCT()
  {
    this.PCT=this.getg()/this.getsog()*100;
  }















}
