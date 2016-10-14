
public class TestTemperature {

	public static void main(String[] args)
	{
		Temperature t1 = new Temperature();
		Temperature t2 = new Temperature();
		//creates two objects t1 and t2 in Temperature class
		
		
		t1.setTemp(86.0,'F');
		t2.setTemp(32.0,'C');
		//sets temperature of two objects
		
		t1.printTemp();
		t2.printTemp();
		//prints temperature of two objects
		
		char a = t1.getScale();
		//stores scale of t1 in 'a'
		
		t2.convert(a);
		//coveresion of scale takes place using convert function
		
		double b = t2.getDegree();
		double c = t1.getDegree();
		// stores degree of both the temperatures after conversion in b and c
		
		
		if(c==b)					//if both the degrees are equal then prints equivalent
		{
			System.out.println("Equivalent");
		}
		else						//else print Not equivalent
		{
			System.out.println("Not equivalent");
		}
	
	}
}