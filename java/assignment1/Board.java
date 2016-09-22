public class Board{
  private Piece[][] gameboard;
  private boolean[][] gamelist;


  public Board()
  {
     gameboard=new Piece[8][8];
   gamelist=new boolean[8][8];
  }
  public boolean add(String n,String c,int x,int y,String type)
  {
    if(type=="Slow"){
    if(gamelist[x][y])
    {
      return false;
    }
      else{
        gameboard[x][y]=new SlowPiece(n,c,x,y);
        gamelist[x][y]=true;
      }}
      return true;
  }
    public String move(int x,int y,String d,int step)
    {
      if(gamelist[x][y])
      {
        gameboard[x][y].move(d,step);
        System.out.println("Complete !");
        }
        else System.out.println("No Piece !");
    }

   public void show()
   {
     for(int i=0;i<8;i++)
     {
       for(int c=0;c<8;c++)
       {
         if(gamelist[i][c])
         {
           System.out.print(gameboard[i][c]);
         }
         else System.out.print("        .");
       }System.out.println(" ");

     }
   }
}
