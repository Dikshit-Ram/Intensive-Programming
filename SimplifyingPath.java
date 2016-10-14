import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class SimplifyingPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "/a/./b/../../c/";
		String delimiters = "/";
		StringTokenizer words = new StringTokenizer(s,delimiters);
		int i = 0;
		while(words.hasMoreElements())
		{
			String word = words.nextToken();
			i++; 
		}
		String [] ar = new String[i];
	
		int j=0;
		StringTokenizer tok = new StringTokenizer(s,delimiters);

		while(tok.hasMoreElements())
		{
			ar[j]= tok.nextToken();
			j++; 
		}
		Stack<String> st = new Stack<String>();
		String dd = "..";
		for(i=0;i<ar.length;i++)
		{
			if(ar[i].equals(".."))
			{

				if(st.isEmpty()!= true)
					st.pop();
			}
			else if(ar[i].equals("."))
			{
			}
			else
			{
				st.push(ar[i]);
			}
		}
		
		System.out.println("/"+st.peek());
	}

}























