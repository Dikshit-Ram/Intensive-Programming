import java.util.Arrays;

public class SortingColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {2,3,4,4,3,2,2,3,4};					//input array unsorted
		System.out.println(Arrays.toString(a));
		sort(a,2);										//sort array wrt 2
		System.out.println(Arrays.toString(a));
		sort(a,3);										//sort array wrt 3
		System.out.println(Arrays.toString(a));
	}

	
	public static void sort(int [] input, int pivot)	
	{
		int i = 0;										//i point to first element
		int j = input.length-1;							//j point to last element
		
		while(i< j)										//i increases until ith element is greater than pivot
		{												
			while(i<j && input[i]<= pivot)				//j decreases until jth element is less than pivot
			{
				i++;									//when this occurs and i<j then swap method is called 
			}											
			
			while(i<j && input[j]> pivot)
			{											
				j--;
			}
			swap(input,i,j);							//for swapping
			
		}
	}
	
	public static void swap(int [] input, int i, int j)		//swapping method
	{
		int temp = input[j];
		input[j] = input[i];
		input[i] = temp;
	}
}
