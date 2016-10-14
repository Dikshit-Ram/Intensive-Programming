import java.util.Scanner;
public class TwoSum {
	

		public static void main(String [] args)
		{
			int [] b={1,3,7,12,56};						//creates an array
			System.out.println("Enter target value");	
			Scanner sc = new Scanner(System.in);		
			int c = sc.nextInt();						//stores target value from user in c
			twoSum(b , c);								//calls twoSum
		
		}
		
		
		
		
		public static void twoSum(int [] x, int y)
		{
			int n=x.length-1;
			int a = 0;
			for(int i=0;i<=n;i=i+0)
			{	
				a = x[i]+x[n];			//stores added value at i index and n index in a

				if(a==y)				//if a is equal to y execute the loop
				{
					System.out.println("The array indices whose value sum to"+y+"are:\n"+i+"\n"+n);
					break;
				}	
			
				else if(a<y)			//if a is less than y increment i
				{
					i++;
				}
				
				else if(a>y)			//if a is greater than y then decrement n
				{
					n--;
				}
				else					//all other cases
				{
					System.out.println("No two numbers can give the target value when added.");

				}
			}
			
		}
	}


