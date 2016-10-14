
public class Hello_WIU {


	public static void main(String[] args) {
		
				System.out.println("The output of the program is");
				int i;
				for(i = 1;i < 100;i++)
				{
					if(i%3==0||i%5==0)						//if the number is divided by either 3 or 5 it enters braces
					{
						if(i%3==0&&i%5!=0)					//if the number is divided only by 3 then it prints "Hello"
						{
							System.out.println("Hello");
						}
						if(i%5==0&&i%3!=0)					//if the number is divided only by 5 then it prints "WIU"
						{
							System.out.println("WIU");
						}
						if(i%3==0&&i%5==0)					//if the number is divided both by 3 and 5 then it prints "Hello WIU"
						{
							System.out.println("Hello WIU");
						}
					}
					else
					{
						System.out.println(+i);				//if the number is not divisible by either 3 or 5 then it prints the number itself
					}
					
				}			
	
		}
}


