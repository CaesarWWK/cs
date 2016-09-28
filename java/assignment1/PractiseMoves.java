import java.util.Scanner;
import java.util.StringTokenizer;
public class PractiseMoves{
private Board game;
public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter Commands to Continue !  : （Type Help for details)");
String line="";
Board game=new Board();
while(!line.equals("exit")){
line = keyboard.nextLine();
    StringTokenizer to``rken;
token = new StringTokenizer(line, " ");
 String e = token.nextToken();
 if(e.equals("crete")){
   String x = token.nextToken();
   String y = token.nextToken();
   String t = token.nextToken();

     System.out.println("Enter the name: ");

     String name = keyboard.nextLine();
      System.out.println("Enter the color: ");
      String color = keyboard.nextLine();
         game.add(name,color,Integer.parseInt(x)-1,Integer.parseInt(y)-1,t);

 }

     if(e.equals("move")){
       int x = Integer.parseInt(token.nextToken())-1;
       int y = Integer.parseInt(token.nextToken())-1;
       String d = token.nextToken();
      if(game.getp(x,y).gett().equals("Fast")||game.getp(x,y).gett().equals("FastFlexible"))
      {
        int steps= Integer.parseInt(token.nextToken());
        game.move(x,y,d,steps);
      }else game.move(x,y,d);
       
  }
  if(e.equals("Help")){
    System.out.println("Possible commands are as follows:\ncreate location [fast][flexible]: Creates a new piece.\nmove location direction [spaces]: Moves a piece.\nPrint: Displays the board.\nHelp: Displays help.\nExit: Exits the program.\n");
  }
  if(e.equals("Print")){
    game.show();
  }
  if(e.equals("Exit")){
    System.exit(0);
  }


line="";e="";
}
}
}
