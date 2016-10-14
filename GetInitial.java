import java.util.Scanner;

public class GetInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);			
		System.out.println("Enter your Firstname:");	//stores the first name
		String a = sc.nextLine();						//entered in a
		
		System.out.println("Enter your Lastname:");		//stores the last name
		String b = sc.nextLine();						//entered in b
		
		String e =a.toUpperCase();						//string e contains all uppercases of first name
		String f =b.toUpperCase();						//string f contains all upercases of last name
		
		
		System.out.println(""+e.charAt(0)+""+f.charAt(0));	//prints initials
		
	}

}
