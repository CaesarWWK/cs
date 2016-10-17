public class Queue<T>
{
private LinkedList<T> list;
int cursor;
 //the cursor is mainly used for the first and the next methods.
//continue rest of the code
int index=0;
public Queue()
{
  LinkedList<T> list=new LinkedList<T>;
  cursor=0;
}
public void enqueue(T item)
{
  list.addToEnd(item);
}
public T dequeue()
{
  list.getAt(cursor);
  list.removeAt(cursor);
  cursor++;
}

public int size(){
 return list.size();
}

public boolean isEmpty()
{
  return list.isEmpty();
}
public void clear()
{
  list.clear();
}
public T peek()
{
  list.getAt(index);
  index++;

}
public int positionOf(T item)
{
  return list.indexOf(item);
}

public void remove(T item)
{
  if(list.indexOf(item)!=-1)
  {
    list.removeAt(list.indexOf(item));
  }
  else System.out.println("No such item");
}

public T first()
{
  if(!this.isEmpty())
  return list.getAt(cursor);
  return null;
  cursor++;
}
public T next()
{
  if(!this.isEmpty())
  return list.getAt(cursor);
  return null;
  cursor++;
}
public void getall()
{
  list.enumerate();
}
public void removeall(T item)
{
  list.remo
}
}
