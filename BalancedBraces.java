import java.util.Stack;

public class BalancedBraces {

	public static boolean balanceTest(String str)
	{
		if(str.length() < 1) return true;    // empty string, return true;
		
		Stack<Character> st = new Stack<Character>();   // create a stack
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch == '{'||ch=='('|| ch=='[')                     // if left bracket, push to the stack
			{
				st.push(ch);
			}
			else
			{
				if (ch == '}')	             //if right bracket: 
				{
					if (!st.isEmpty()&& st.peek()=='{')      // if left bracket exists, pop it up
					{
						st.pop();
					}
					else	               // if no left bracket, already unblanced
						return false;					
				}
				else if(ch == ')')
				{
					if (!st.isEmpty()&& st.peek()=='(')      // if left bracket exists, pop it up
					{
						st.pop();
					}
					else	               // if no left bracket, already unblanced
						return false;
				}
				else if(ch == ']')
				{
					if (!st.isEmpty()&& st.peek()=='[')      
					{
						st.pop();
					}
					else	               // if no left bracket, already unblanced
						return false;
				}
			}	
		}		
		return st.empty() ? true:false;		
	}
	
	public static void main(String[] args)  // test program
	{
		String str = "(){[()]}";
		
		if(balanceTest(str) == true)
			System.out.println("Balanced bracket!");
		else
			System.out.println("Unbalanced bracket!");		
		
	}	
	
}
