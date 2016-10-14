
public class Book {
	
private String name;
private Author[] authors;
private int qtyInStock;
private double price;

public Book(String name, Author[] author, double price)		//constructor with 3 parameters
{
	this.name = name;
	authors = author;
	this.price = price;
}

public Book(String name, Author[] author,double price,int qtyInStock)	//constructor with 4 parameters
{
	this.name = name;
	authors = author;
	this.qtyInStock = qtyInStock;
	this.price = price;
	
}

public String getName()				//returns name to calling function
{
	this.name = name;
	return name;
}

public Author[] getAuthors()		//returns array of author name to calling function
{
	return authors;
}
public double getPrice()			//returns price to calling function
{
	return price;
}
public void setPrice(double price)	//sets price as input to price
{
	price = price;
}
public int getQtyInStock()			//returns qtyInstock to calling function
{
	return qtyInStock;
}
public int setQtyInStock(int qtyInStock)	//sets 'qtyInStock' to qtyInstock
{
	return qtyInStock;
}

public String toString()					//toString function
{
	
	return "Book-"+name+" by ";
}

public void printAuthors()					//prints authors name
{
	for(int i = 0;i<authors.length;i++)
	{
		System.out.println(authors[i]);
	}
}
}
