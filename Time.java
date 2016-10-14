
public class Time {

	private int hour;
	private int minute;
	
	public int getHour()			//return hour to calling function
	{
		return hour;
	}
	
	public int getMinute()			//return minute to calling function
	{
		return minute;
	}
	
	public void setHour(int h)		// sets hour value as h
	{
		hour = h;
	}
	
	public void setMinutes(int m)	//sets minute value to m
	{
		minute = m;
	}

	public void printTime()			//prints time
	{
		
		if (minute<9)					//if minute is less than 9 then prints with a 0 infornt of it
			System.out.println(""+hour+":0"+minute);
		else if(minute>=9&&minute<=59)	//if 9<=minute<=59 then the following code executes
			System.out.println(""+hour+":"+minute);
		else							//else it prints the following
			System.out.println(""+hour+":0"+minute);
	}

	public void advance()			//advances the given time by a minute
	{
		if(minute==59)				//if the minute is 59 then the following code executes and changes hour and minute
		{
			hour = hour+1;
			minute = minute-59;
		}
		else						//for all other minutes hour doesnt change
		{
			hour = hour;
			minute = minute+1;
		}
		 
	}


}
