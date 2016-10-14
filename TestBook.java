
public class TestBook {

	public static void main(String[] args)
	{
		Author[] authors = new Author[2];		
		authors[0] = new Author("Tan Ah Teck","AhTeck@somewhere.com",'m');	//author one values initialised	
		authors[1] = new Author("Paul Tan","Paul@somewhere.com",'m');		//author two values initialised

		Book javaDummy = new Book("Java for Dummy",authors, 19.99,99);		//object created in Book class
		System.out.println(javaDummy);										//to string function called
		System.out.println("The Authors are: ");							
		javaDummy.printAuthors();											//printAuthors method called
	}
}
