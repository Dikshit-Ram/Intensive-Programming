import java.util.*;
import java.util.Arrays;

public class Pangram {
	
	public static void main(String [] args)
	{
		System.out.println("Enter an input string:");		//asks user to enter a string and stores in c
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();	
		int [] a = new int[c.length()];
		int i=0;int j;
		char temp =0;
		String b = "" ;
		
		
		String delimiters = ". ,?(){}[]|?/&\\,;:-\'\"\t\n\r";
		StringTokenizer words = new StringTokenizer(c,delimiters);	// breaks string c and stores only alphabets in order in b string
		while(words.hasMoreElements())
		{
			b =b+""+words.nextToken();
			
		}
		
		for(i =0;i<b.length();i++)				//stores each char of b in array of a
		{
			a[i] = b.charAt(i);
		}
		
		
		Arrays.sort(a);							//sorts array of a in order
		
		
		int count = 0;
		for(i = 65;i<90;i++)					//count = value of each alphabet in ascii value added
		{
			count = count+i;
		}
		
		
		
		for(i=0;i<a.length-1;i++)				
		{
			
			if(a[i]!=a[i+1])					//when first and next char are not equal
			{
				count = count - a[i];			//minus the value of a[i] from the total count 
			}
			
			
		}
		
		if(count <= 0)							//after all the operation if the count is not positive
		{										//then the sentence is pangram as the pangram may have repeated
			System.out.println("pangram");		//characters so...the count at the end should be less than or equal to 0
		}
		else
			System.out.println("not pangram");
		
		
		
		
		
	
	}
}