
public class Box {
	private double width;
	private double height;
	private double length;

	public void setWidth(double w)			//sets width to 'w'
	{
		width = w;
	}

	public void setHeight(double h)			//sets height to 'h'
	{
		height = h;
	}

	public void setLength(double l)			//sets length to 'l'
	{
		length = l;
	}


	public double getVolume()				//calculates volume of box and returns it
	{
		double vol = height*width*length;
		return vol;
	}


	public String toString()				//toString function
	{
		String str = "The box has width as "+width+",height as "+height+" and length as "+length;
		return str;
				
	}



}
