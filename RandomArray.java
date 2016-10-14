
public class RandomArray {


	public static void main(String[] args) {
		int [] a = new int [10];							//new 10*1 array is created
		System.out.println("array before reversing is:"); 
		int temp;
		for(int i=0;i<10;i++)
		{
			a[i]=(int)(Math.random()*(100-10)+10);			//takes random int value from 10 to 99 inclusive
			System.out.print(" "+a[i]);						//prints array generated
		}
		System.out.println("\narray after reversing is:");
		for(int i=0;i<5;i++)
		{
			temp = a[i];									//values of array are swapped using this logic
			a[i] = a[9-i];
			a[9-i]=temp;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(" "+a[i]);						//prints reversed array
		}
	}

}


