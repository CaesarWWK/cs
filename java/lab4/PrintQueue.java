public class PrintQueue{
private Queue<Job> queue=new Queue<Job>();
   public PrintQueue()
   {
       }
   public void lpr(String owner,int JobId)
   {
     Job a=new Job(owner,JobId);
     queue.enqueue(a);
   }
   public void lpq()
   {
     queue.getall();
   }

   public void lprm(int JobId)
   {
     if(queue.first().getJobId()!=JobId)
     {
       while(queue.getcursor()<queue.size())
          {
            if(queue.next().getJobId()==JobId)
              queue.removeAt(queue.getcursor());

          }
     }
   }

public void lprmAll(String owner)
{
  for(int n=0;n<queue.size();n++)
  {
    if(queue.peek(n).getOwner().equals(owner))
        {
          queue.removeAt(n);
        }
  }
}

}
