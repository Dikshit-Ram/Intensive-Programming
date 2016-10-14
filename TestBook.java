
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a3 = new Author("zheng","liz180@wiu.edu",'m');
		//creates an object a3 in class Author
		
		
		Book b1 = new Book("Intensive Programming 1",a3, 100.0,10);
		//creates an object b1 in class Book
		
		
		System.out.println(""+b1+" "+b1.getAuthor().getName()+" ("+b1.getAuthor().getGender()+") at "+b1.getAuthor().getEmail());
		//prints output
		
		
		Author a4 = new Author("li","li@wiu.edu",'m');
		Book b2 = new Book("Intensive Programming 2",a4,4.5,799);
		// creates two other objects a4 and b2 in classes Author and Book respectively
		
		
		System.out.println(""+b2+" "+b2.getAuthor().getName()+" ("+b2.getAuthor().getGender()+") at "+b2.getAuthor().getEmail());
		//prints updated output

	}

}
