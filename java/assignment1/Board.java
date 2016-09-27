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
  if(x<0||y<0||x>7||y>7)
    {
        System.out.println("Out of Boundry");
        return false;
    }

  if(type.equals("Slow"))
    {
      if(gamelist[x][y])
        {
          System.out.println("Its Full ");
          return false;
        }
      else
        {
          gameboard[x][y]=new SlowPiece(n,c,x,y);
          gamelist[x][y]=true;
        }
      }

      else if(type.equals("Fast"))
        {
          if(gamelist[x][y])
            {
              System.out.println("Its Full ");
              return false;
            }
            else
              {
                gameboard[x][y]=new FastPiece(n,c,x,y);
                gamelist[x][y]=true;
              }
        }

       else if(type.equals("FastFlexible"))
          {
            if(gamelist[x][y])
              {
                System.out.println("Its Full ");
                return false;
              }
            else
              {
                gameboard[x][y]=new FastFlexible(n,c,x,y);
                gamelist[x][y]=true;
              }
          }

        else if(type.equals("SlowFlexible"))
          {
            if(gamelist[x][y])
              {
                System.out.println("Its Full ");
                return false;
              }
              else
              {
                gameboard[x][y]=new SlowFlexible(n,c,x,y);
                gamelist[x][y]=true;
              }
          }
          else
          {
            System.out.println("Input Wrong");
          }


      return true;
  }

  public void move(int x,int y,String d,int move)
    {
      if(gamelist[x][y])
    {
        gamelist[x][y]=false;
        System.out.print(gameboard[x][y].getname());
        gameboard[x][y].move(d,move);

        int x1=gameboard[x][y].getx();
        int y1=gameboard[x][y].gety();
        gamelist[x1][y1]=true;
        gameboard[x1][y1]=gameboard[x][y];
        gameboard[x][y]=null;
    }
      else
        {
          System.out.println("There is no Piece");
        }
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
        System.out.println(gameboard[x1][y1].getx()+" "+gameboard[x1][y1].gety());
      }
        else
        {
          System.out.println("There is no Piece");
        }
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
         else System.out.print("     .");
       }
        System.out.println(" ");
     }
   }

   public Piece getp(int x,int y)
   {
     return gameboard[x][y];
   }
}
