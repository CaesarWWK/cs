import java.util.ArrayList;
public class GenericStack<T> {
private ArrayList<T> stack;

public GenericStack(){
  stack = new ArrayList<T>();
}

public int getSize()
{
  return stack.size();
}
public T peek()
{//增加空指针检测
  return stack.get(stack.size()-1);
}
public void push(T t)
{
  stack.add(t);
}
public T pop()
{
  T p=null;
  if(!isEmpty())
  {
    p=stack.remove(stack.size()-1);
  }
  
  return p;
}
public boolean isEmpty(){
  return stack.isEmpty();
}
}
