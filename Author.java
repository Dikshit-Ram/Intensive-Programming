//import java.lang.*;
public class Author {

	private String name;
	private String email;
	private char gender;
	
	public Author(String na,String em,char gen)	//constructor of Author class
	{
		name = na;
		email = em;
		gender = gen;
	}
	
	
	public String getName()						//Returns name to the calling function
	{
		name = name;
		return name;
	}
	
	public String getEmail()					// returns email to the calling function
	{
		email = email;
		return email;
	}
	
	public void setEmail(String ema)			//sets 'ema' as value to email
	{
		email = ema;
	}
	
	public char getGender()						//returns gender to calling function
	{
		gender = gender;
		return gender;
	}


	public String toString()					//toString function
	{
		//String str = ""
		return ""+name+" "+gender+" "+email;
		//String str = "The box has width as "+name+",height as "+gender+" and length as "+email;
		
	}






}
