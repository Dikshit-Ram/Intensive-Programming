
public class SA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,2,3,3,4};					//input array
		
		System.out.println(search(a,0));			
	}

	public static int search(int [] input, int target)
	{
		int i = input.length/2;					// i points to mid of array
		while(input[i]!=target)		
		{
			if(input[i] > target)				//if the i element is greater than target
			{
				i = i/2;						//discard the after i half
			}
			else if(input[i] < target)			//if the i element is less than target
			{
				i = i*2-i/2;					//discard the before i half
			}
			else if (input[i]==target)			//if i is target then see if it is the lowest index for that value
			{
				while(input[i]==target)
				{
					i--;
				}
			}
				
			
		}
		
		return i;
		
	}
	
	
}
