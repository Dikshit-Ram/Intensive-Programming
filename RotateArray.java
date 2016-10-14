public class RotateArray 
{
public static void main(String[] args) 
{
	int [] a = {0,2,3,4,5};     
	int b = 3;        
	rotate(a,b);       					//method called
}
		 
		 
	public static void rotate(int [] nums,int k)	
	{
		 int i;
		 int [] temp = new int [nums.length];  	//create temporary array of intial array length
		 for(i=0;i<nums.length;i++)    
		  {
			 int m = i+k;						
			 if(m >= nums.length)				//when m is greater than initial array length
			 {
				 m = m-nums.length;				//then subtract length from m or else save at the same index
			 }
			 temp[m] = nums[i];
		  }
		  
		  for(i =0;i<temp.length;i++)  
		  {
			  System.out.print(temp[i]);
		  }
	}
}
