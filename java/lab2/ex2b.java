public class ex2b{
public static void main(String[] args)
{
GenericStack<String> stack1 = new GenericStack<String>();
stack1.push("London");
stack1.push("Paris");
stack1.push("Halifax");
System.out.print(stack1.pop());
System.out.print(stack1.pop());
System.out.print(stack1.pop());
GenericStack<Integer> stack2 = new GenericStack<Integer>();
stack2.push(1);
stack2.push(2);
stack2.push(3);
System.out.print(stack2.pop());
System.out.print(stack2.pop());
System.out.print(stack2.pop());
}
}
