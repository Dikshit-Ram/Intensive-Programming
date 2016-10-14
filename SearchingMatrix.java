import java.util.Arrays;

public class SearchingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [][] = {	{1,4,7,11,15},				//input array
						{2,5,8,12,19},
						{3,6,9,16,22},
						{10,13,14,17,24},
						{18,21,23,26,30}
						};
		
		
		System.out.println(matrixSearch(a,5));
		
	}
		
		public static boolean matrixSearch(int a [][],int target)
		{
		
		int i = 0;								//i points to row
		int j = a[i].length-1;					// j points to the cloumn
		
		while(a[i][j] != target )				//run loop until target is found 
		{
			if(a[i][j] < target)				//if last element in first row is less than target
			{
				i = i + 1;						//increase row
				if(i==a.length)					//if row has gone out of index then break
				{
					i = i-1;
					break;
				}
				
				
			}
			else if(a[i][j] > target)			//if a element is greater than target
			{
				j = j-1;						//then decrease column
				if(j<0)							//if j goes out of bound then break
				{
					j = j+1;
					break;
				}
			
			}
			
		}

		if(a[i][j]==target)						//if the element at which the loops break is target return true
		{
			return true;
		}
		else
			return false ;
		
	}

}
