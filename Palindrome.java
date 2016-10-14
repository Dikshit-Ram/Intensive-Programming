import java.util.*;
public class Palindrome {

	public static void main(String[] args)
	{
		System.out.println("Enter a string:");			//prompts user to ener a string
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();						//stores the string in c
		int i;
		
		
		String b = "" ;									// create two new string b and d
		String d = "" ;
		String delimiters = " .,?!(){}[]|?/&\\,;:-\'\"\t\n\r";
		StringTokenizer words = new StringTokenizer(c,delimiters);		//string tokenizer is used to delete all extra characters
		while(words.hasMoreElements())
		{
			b += words.nextToken();						//all alphabets in order are stored in b string
		}
		char [] y = new char [b.length()];
		
		for(i=0;i<b.length();i++)						//reverse of string b is stored in y char array
		{
			y[i] = b.charAt(b.length()-(1+i));
			 
		}
		for(i=0;i<b.length();i++)						//the array is stored as it is in string d
		{
			d += y[i];
		}
		if(b.equalsIgnoreCase(d))						//if b and d string are equal then palindrome
		{
			System.out.println("'"+c+"' is a palindrome");
		}
		else
			System.out.println("'"+c+"' is not a palindrome");
		
	}
}
