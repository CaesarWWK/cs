import java.util.Scanner;
import java.util.StringTokenizer;
public class PractiseMoves{
private Board game;
public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);

String line="";
Board game=new Board();
while(!line.equals("exit")){
line = keyboard.nextLine();
    StringTokenizer token;
token = new StringTokenizer(line, " ");
 String e = token.nextToken();
 if(e.equals("crete")){
   String x = token.nextToken();
   String y = token.nextToken();
   String t = token.nextToken();

     System.out.print("Enter the name: ");

     String name = keyboard.nextLine();
      System.out.print("Enter the color: ");
      String color = keyboard.nextLine();
         game.add(name,color,Integer.parseInt(x)-1,Integer.parseInt(y)-1,t);

 }

     if(e.equals("move")){
       int x = Integer.parseInt(token.nextToken())-1;
       int y = Integer.parseInt(token.nextToken())-1;
       String d = token.nextToken();
      if(game.getp(x,y).getname().equals("Fast"))
      {
        int steps= Integer.parseInt(token.nextToken());
        game.move(x,y,d,steps);
      }else game.move(x,y,d);

  }
  game.show();
line="";e="";
}
}
}
