public class PrintQueue{
private Queue<Job> queue;
   public PrintQueue()
   {
     Queue<Job> queue=new Queue<Job>();
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
              queue.removeAt(queue.getcursor()-1);

          }
     }else queue.removeAt(queue.getcursor()-1);
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
