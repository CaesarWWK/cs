public class Test{
  public static void main(String[] args)
  {
  Queue<Job> test=new Queue<Job>();
    Job a=new Job("a",309);
     test.enqueue(a);
      System.out.println(test.dequeue());
      System.out.println(test.isEmpty());
      Job b=new Job("b",310);
      Job c=new Job("c",311);
      Job d=new Job("d",312);
     test.enqueue(b);
     test.enqueue(c);
     test.enqueue(d);
     System.out.println("The position of Job d is "+test.positionOf(d));
     test.remove(d);
     System.out.println("The position of Job d is "+test.positionOf(d));
     System.out.println("The first Job is "+test.first());



    PrintQueue queue=new PrintQueue();
    queue.lpr("swilliams",309);
    queue.lpr("ronaldinho",300);
    queue.lpr("marionjones",312);
    queue.lpr("swilliams",267);
    queue.lpr("davidh",135);
    queue.lpr("ronaldinho",301);

    queue.lprm(309);
   queue.lprmAll("ronaldinho");
   queue.lpq();

  }
}
