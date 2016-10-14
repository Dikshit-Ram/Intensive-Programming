
public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates a new object in class Author
		Author a1 = new Author("dikshith ram adabala","dikshithram.adabala@gmail.com",'m');
		
		//calls toString function in Author class
		System.out.println(a1);
		
		//changes email to another email
		a1.setEmail("dikshith@gmail.com");
		a1.getEmail();
		
		//calls toString function to print new output
		System.out.println(a1);
		
		
		
	}

}
