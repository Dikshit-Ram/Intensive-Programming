
public class Book {

	private String name;
	private Author author;
	private double price;
	private int qtyInstock = 0;
	
	
	public Book(String name,Author author,double price)			//constructor with 3 parameters
	{

		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name,Author author,double price,int qty)	//constructor with 4 parameters
	{
		
		this.name = name;
		this.author = author;
		
		this.price = price;
		this.qtyInstock = qty;
	}
	
	public String getName()										//returns name to calling function
	{
		name = name;
		return name;
	}
	
	public Author getAuthor()									//returns author name to calling function
	{
		author = author;
		return author;
	}
	
	public double getPrice()									//returns price to calling function
	{
		price = price;
		return price;
	}
	
	public void setPrice(double p)								//sets 'p' as input to price
	{
		price = p;
	}
	
	public int getQtyInStock()									//returns qtyInstock to calling function
	{
		qtyInstock = qtyInstock;
		return qtyInstock;
	}
	
	public void setQtyInStock(int qty)							//sets 'qty' to qtyInstock
	{
		qtyInstock = qty;
	}
	
	
	public String toString()									//toString function
	{
		return "'"+name+"' by ";
	}
	
	
	
	
}
