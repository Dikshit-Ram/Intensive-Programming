
public class Worker {

	private String workerName;
	private int workerId;
	private boolean isWorking;
	
	 Worker(String wn,String wid, String isw)		//worker constructor
	{
		workerName = wn;
		workerId = Integer.parseInt(wid);
		isWorking = Boolean.parseBoolean(isw);
 
	}
	
	public String getName()							//getName function
	{
		workerName = workerName;
		return workerName ;
	}
	
	public void setName(String name)				//setName function
	{
		workerName = name;
	}
	
	public int getId()								//getId method
	{
		workerId = workerId;
		return workerId;
	}
	
	public void setId(int id)						//setid method
	{
		workerId = id;
	}
	
	public boolean getIsWorking()					//getIsWorking method
	{
		isWorking = isWorking;
		return isWorking;
	}
	
	public void setIsWorking(boolean working)		//setIsworking method
	{
		working = isWorking;
	}
	
	public String toString()						//tostring method
	{
		return ""+this.workerName+" "+this.workerId+" "+this.isWorking;
	}
}




