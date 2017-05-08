public class NHLStats
{
private List<PlayerRecord> playerlist;

public NHLStats()
{
  playerlist=new List<PlayerRecord>();
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
public void enumerate()
{
  playerlist.enumerate();
}
public void highestS()
{
  PlayerRecord maxplayer=new PlayerRecord();
  maxplayer=playerlist.first();
  LinkedList<String> maxn=new LinkedList<String>();
  while(playerlist.getcursor()<playerlist.size())
  {
      PlayerRecord n=new PlayerRecord();
     n=playerlist.next();
      if(n.getP()>maxplayer.getP())
      {
        maxplayer=n;
      }
     
  }
  maxn.add(maxplayer.getname());
  for(int n=0;n<playerlist.size();n++)
  {
      PlayerRecord a2=new PlayerRecord();
      a2=playerlist.next();
      if(a2.getP()==maxplayer.getP())
      {
        maxn.add(a2.getname());
      }
  }
   maxn.enumerate();

}

}
