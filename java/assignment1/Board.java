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
    if(type.equals("Slow")){
    if(gamelist[x][y])
    {
      return false;
    }
      else{
        gameboard[x][y]=new SlowPiece(n,c,x,y);
        gamelist[x][y]=true;
      }}

      if(type.equals("Fast")){
      if(gamelist[x][y])
      {
        return false;
      }
        else{
          gameboard[x][y]=new FastPiece(n,c,x,y);
          gamelist[x][y]=true;
        }}

        if(type.equals("FastFlexible")){
        if(gamelist[x][y])
        {
          return false;
        }
          else{
            gameboard[x][y]=new FastFlexible(n,c,x,y);
            gamelist[x][y]=true;
          }}

          if(type.equals("SlowFlexible")){
          if(gamelist[x][y])
          {
            return false;
          }
            else{
              gameboard[x][y]=new SlowFlexible(n,c,x,y);
              gamelist[x][y]=true;
            }}



      return true;
  }

  public void move(int x,int y,String d,int move)
  {
    if(gamelist[x][y])
    {



      gameboard[x][y].move(d,move);

      gamelist[gameboard[x][y].getx()][gameboard[x][y].gety()]=true;
      System.out.println("Complete !");
      }
      else System.out.println("No Piece !");
      }

    public void move(int x,int y,String d)
    {
      if(gamelist[x][y])
      {
      gamelist[x][y]=false;

        gameboard[x][y].move(d);
        int x1=gameboard[x][y].getx();
        int y1=gameboard[x][y].gety();
                   gamelist[x1][y1]=true;
               gameboard[x1][y1]=gameboard[x][y];
               gameboard[x][y]=null;
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
           System.out.print(gameboard[i][c].getname());
         }
         else System.out.print("     .");
       }System.out.println(" ");

     }
   }

   public Piece getp(int x,int y)
   {
     return gameboard[x][y];
   }
}
