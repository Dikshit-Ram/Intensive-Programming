
public class TestBox {
	
	
	
	
	public static void main(String [] args)
	{
		Box box1 = new Box();				//creates box1 object in class Box
		box1.setWidth(30.2);				//sets width of box to 30.2
		box1.setHeight(12.3);				//sets height of box to 12.3
		box1.setLength(35.0);				//sets length of box to 35.0
		System.out.println(box1);			//calls toString function
		System.out.println("volume of box is "+box1.getVolume());	//prints volume of box using width and height and length
	}
	
}
