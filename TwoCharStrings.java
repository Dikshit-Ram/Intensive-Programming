import java.util.Scanner;

public class TwoCharStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);			//prompts
		System.out.println("enter the first string:");
		String a = sc.nextLine();
		
		System.out.println("enter second string:");
		String b = sc.nextLine();
		
		twoStrings(a,b);
	
	}

	
	public static void twoStrings(String x, String y)
	{
		StringBuffer s1 = new StringBuffer(x);
		
		StringBuffer s2 = new StringBuffer(y);
		int i,j;
		
		char [] a1 = new char[x.length()];
		char [] a2 = new char[y.length()];
		String [] a3 = new String[x.length()*y.length()];
		String s3 = "";
		
		for(i = 0;i<x.length();i++)
		{
			a1[i] = x.charAt(i);
			
		}
		
		for(i = 0; i<y.length();i++)
		{
			a2[i] = y.charAt(i);
		}
		
		for(i=0;i<x.length()-1;i++)
		{
			for(j=i+1;j<x.length();j++)
			{
				if(a1[i]==a1[j])
				{
					s1.deleteCharAt(j);
				}
			}
		}
		
		for(i=0;i<y.length()-1;i++)
		{
			for(j=i+1;j<y.length();j++)
			{
				if(a2[i]==a2[j])
				{
					s2.deleteCharAt(j);
				}
			}
		}
	
		for(i=0;i<s1.length();i++)
	
		{
			for(j=0;j<s2.length();j++)
			{	
				s3 += " "+s1.charAt(i)+s2.charAt(j);
				
			}
			
		}
		
	
	System.out.println(s3);
}
}
	
	

