public class Queue<T>
{
private LinkedList<T> list;
int cursor;
 //the cursor is mainly used for the first and the next methods.
//continue rest of the code
int index=0;
public Queue()
{
  LinkedList<T> list=new LinkedList<T>();
  cursor=0;
}
public void enqueue(T item)
{
  list.add(item);
}
public T dequeue()
{
  T item=list.getAt(cursor);
    list.removeAt(cursor);
  cursor++;
  return item;
}
public int getcursor()
{
  return this.cursor;
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
public T peek(int index)
{
  T item=list.getAt(index);

   index++;
   return item;

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
  cursor++;
  return null;

}
public T next()
{
  if(!this.isEmpty())
  return list.getAt(cursor);
   cursor++;
    return null;

}
public void getall()
{
  list.enumerate();
}
public void removeall(T item)
{
  list.clear();
}
public void removeAt(int t)
{
  list.removeAt(t);
}
}
