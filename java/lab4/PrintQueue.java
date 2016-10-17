public class PrintQueue{
   private Queue<T> queue;

   public PrintQueue()
   {
     Queue<T> queue=new Queue<T>;
   }
   public void lpr(String owner,int jobId)
   {
     job a=new job(owner,jobId);
     queue.enqueue(a);

   }
   public void lpq()
   {
     queue.getall();
   }

   public void lprm(int jobId)
   {
     if(queue.first().getJobId()!=jobId)
     {
       while(cursor<queue.size())
          {
            if(queue.next().getJobId()==jobId)
              queue.removeAt(cursor-1);

          }
     }else queue.removeAt(cursor-1);
   }

public void lprmAll(String owner)
{
  for(int n=0;n<queue.size();n++)
  {
    
  }
}

}
