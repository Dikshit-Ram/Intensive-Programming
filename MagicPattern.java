
public class MagicPattern {


	public static void main(String[] args) {
		System.out.println("The 7*7 checker board will have the following deisgn:");
		for(int i = 1; i < 7;i++)		//use for loop for seven rows
		{
			if(i%2==0)					//if the line is even then "#" prints with a space in front of it
			{
				for(int j=0;j<=7;j++)	//this for loop is used for each element in single line
				{
					System.out.print(" #");
				}
			}
			else						//odd lines gets printed by "#" and then a space after it
			{
				for(int j=1;j<=7;j++)
				{
					System.out.print("# ");
				}
			}
			System.out.println("");		//this takes us to a new line after a line is finished with printing
		}
	
	}

}


