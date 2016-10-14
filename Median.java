import java.util.Scanner;					//use scanner class

public class Median {


	public static void main(String[] args) {
		
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");	//take input from users
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.println("The median of 3 numbers is:"+median(x,y,z));
	}
		
		
	public static int median(int a,int b,int c)	{
		if(a<b&&b<c||a>b&&b>c)					//checks if b is median or not
		{
			System.out.println("The median is:"+b);
			return b;
		}
		else if(a<b&&a>c||b<a&&a<c)				//checks if a is median or not
		{
			System.out.println("The median is:"+a);
			return a;
		}
		else									//if above conditions fail c is median
		{
			System.out.println("The median is:"+c);
			return c;
		}
	
	
	}}





