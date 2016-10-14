
public class StudentWorker extends Worker{					//worker class is inherited by StudentWorker class

	private int hoursWorked;
	private boolean isWorkStudy;
	private double payRate;
	
	 StudentWorker(String wn, String wid, 					//StudentWorker constructor
			String isw, String hoursworked, 
			String workstudy, String payrate)
	{
		super(wn,wid,isw);
		hoursWorked = Integer.parseInt(hoursworked);
		isWorkStudy = Boolean.parseBoolean(workstudy);
		payRate = Double.parseDouble(payrate);

	}
	
	public double getPayRate()					//getPayRate method
	{
		payRate = payRate;
		return payRate;
	}
	
	public void setPayRate(double rate)			//setPayRate method
	{
		
		payRate = rate;
	}
	
	public String toString()					//toString method
	{
		return ""+getName()+" "+this.getId()+
				" "+this.getIsWorking()+" "
				+this.hoursWorked+" "+this.payRate;
	}
}
