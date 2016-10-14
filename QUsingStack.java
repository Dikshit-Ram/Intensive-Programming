import java.util.Stack;

public class QUsingStack<T> {

	
	Stack<T> st1 = new Stack<T>();
	Stack<T> st2 = new Stack<T>();
	
	public void push(T x)
	{
		st1.push(x);
	}
	
	public T pop()
	{
		int x = st1.size();
		for(int i=0;i<x;i++)
		{
			T b = st1.pop();
			st2.push(b);
		}
		T a = st2.pop();
		for(int i=0;i<x-1;i++)
		{
			T c = st2.pop();
			st1.push(c);
		}
		return a;
	}
	
	public T peek()
	{
		int x = st1.size();
		for(int i=0;i<x;i++)
		{
			T b = st1.pop();
			st2.push(b);
		}
		T a = st2.peek();
		for(int i=0;i<x-1;i++)
		{
			T c = st2.pop();
			st1.push(c);
		}
		return a;
		
		
	}
	
	public boolean empty()
	{
		return st1.isEmpty();
	}
}
