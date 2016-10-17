public class NHLStats
{
private List<PlayerRecord> playerlist;

private NHLStats()
{
   List<PlayerRecord> playerlist=new List<PlayerRecord>();
}
public void add(PlayerRecord n)
{
 playerlist.add(n);
}
public boolean isEmpty()
{
  if(playerlist.isEmpty())
  return false;
  return true;
}
public PlayerRecord first()
{
  return playerlist.first();
}
public PlayerRecord next()
{
  return playerlist.next();

}
public PlayerRecord enumerate()
{
  return playerlist.enumerate();
}
public void highestS()
{
  int max=playerlist.first.getP();
  String maxc=playerlist.first.getname();
  LinkedList<String> maxn=new LinkedList<String>();
  for(buweikong)
  {
      PlayerRecord n=new PlayerRecord(playerlist.next());
      if(n.getP()>max)
      {
        max=n.getP();
        maxc=n.getname();
      }
  }
  for

}

}
