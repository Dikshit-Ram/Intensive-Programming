
public class TestTime {

	
	public static void main(String[] args)
	{
		Time t1 = new Time();		// creates an object t1 in class Time
		t1.setHour(10);				//sets hour to '10'
		t1.setMinutes(59);			//sets minutes to '59'
		t1.advance();				//uses advance function to advance time by one minute
		t1.printTime();				//prints time
		
	}
}
