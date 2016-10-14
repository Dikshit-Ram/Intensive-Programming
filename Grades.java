import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);							
		System.out.println("Enter the points to calculate grade:");
		double p =sc.nextDouble();										//stores the points entered by user in p
		{
			if((p*10)%5==0&&p>0&&p<120)									//As points are given in 0.5 increments if p*10 is divided by 5 then enters the loop
			{
				System.out.println("Grade for "+p+" is: "+grades(p));	//calls the method grades with p as argument
				System.out.println("Points-->Grades");
				double i=0;
			
				do														//this prints all grades for points list
				{
					System.out.println(i+" -->"+grades(i));
					i+=0.5;
				}while(i<=120);
			}
			
			else														//if p*10 is not dividable by 5 then you must run the program again
			{
				System.out.println("Invalid input........try again:");	//Make sure you go top of output to see th entire output
				
			}
		}
	}
	
	
		
		private static double grades(double p) {						//takes p as argument from main method and returns the appropriate value
		
		if(p<=49.5)
			return 5.0;
		else if(50<=p&&p<=59.5)
			return 4.7;
		else if(60<=p&&p<=64.5)
			return 4.0;
		else if(65<=p&&p<=69.5)
			return 3.7;
		else if(70<=p&&p<=74.5)
			return 3.3;
		else if(75<=p&&p<=79.5)
			return 3.0;
		else if(80<=p&&p<=84.5)
			return 2.7;
		else if(85<=p&&p<=89.5)
			return 2.3;
		else if(90<=p&&p<=94.5)
			return 2.0;
		else if(95<=p&&p<=99.5)
			return 1.7;
		else if(100<=p&&p<=104.5)
			return 1.3;
		else if(105<=p&&p<=120)
			return 1.0;
		else
			return 0;
	}


}
