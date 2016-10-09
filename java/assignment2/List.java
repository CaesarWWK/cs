public class List<T>{
  private LinkedList <T>element;
  private int cursor;

  public List(){
    element=new LinkedList <T>();
    cursor=-1;
  }

  public void add(T item)
  {
    element.add(item);
  }
  public int size()
  {
    return element.size();

  }
  public boolean isEmpty()
  {
    return elements.isEmpty();
  }
  public boolean contains(T item)
  {
    return (element.indexof(item)!=-1);
  }
  public void remove(T item)
  {
    elements.remove(item);
  }
  public void removeAll(T item)
  {
    element.removal(item);
  }

 public void clear()
  {
    element.clear();
  }
public void enumerate()
{
  elements.enumerate();
}
public T first()
{
  if (elements.size()==0)
    return pull;
  cursor=0;
  return elements.getAt(cursor);
}

public T next()
{
  if (cursor<0||cursor==elements.size()-1)
    return null;
    cursor++;
    return elements.getAt(cursor);
}


}
