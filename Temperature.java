
public class Temperature {

	private double degree;
	private char scale;
	
	public Temperature()			//constructor
	{
		degree = 0.0;
		scale = 'C';
	}
	
	public double getDegree()		//returns degree to calling function
	{
		return degree;
	}
	
	public char getScale()			//returns scale to calling function
	{
		return scale;
	}
	
	public void setTemp(double nd,char ns)		//sets degree to 'nd' and scale to 'ns'
	{
		degree = nd;
		scale = ns;
	}
	
	public void convert(char ns)		//converts the temperature from one scale to another
	{
		if(scale != ns)
		{
			if(scale=='C')
			{
				degree = (degree*(1.8))+32;
			
			}
		
			else
			{
				degree = (degree-32)*(1.8);
			}
		}
	}
	
	public void printTemp()				//prints the temperature
	{
		System.out.println(""+degree+" "+scale);
	
	}
	
}
