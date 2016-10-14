
public class SearchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,2,3,3,4};					//input array
		
		System.out.println(search(a,5));			
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
				i = input.length-i/2;					//discard the before i half
			}
			
				
			
		}
		
		if(input[i]==target)					//get the least index with the target value
		{
			while(input[i]==target)
			{
				i--;
				if(i<0)
					return i+1;
			}
			return i+1;
		}
			
		else
			return -1;
		
	}
	
	
}
