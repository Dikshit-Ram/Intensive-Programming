
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10 ;
		
		System.out.println(ways(n));
	}
	
	public static double ways(int number)
	{
		
		if(number == 1||number == 2 )			//if number is 1 or 2 then return 1 or 2 respectively
		{
			
			return number;
		
		}
		else if( number ==3)					//if it is 3 then return 4
		{
			return 4;
		}	
		else									//for bigger iterations use recursion
		{
			
			return ways(number-1)+ways(number-2)+ways(number-3);
			 
		}
	}

}
