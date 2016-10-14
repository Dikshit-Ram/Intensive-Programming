import java.util.ArrayList;

public class StudentWorkerDB  {

	private ArrayList<StudentWorker> stuworkers ;
	
	public StudentWorkerDB()								//constructor
	{
		stuworkers = new ArrayList<StudentWorker>();
	}
	
	public void addStudentWorker(StudentWorker stuwrk)		//add stuwrk to stuworkers
	{
		stuworkers.add(stuwrk);
	}
	
	public ArrayList<StudentWorker> workpermitted()		//work permitted method
	{
		ArrayList<StudentWorker> ret = new ArrayList<StudentWorker>();	//create ret arraylist
		for(int i=0;i < stuworkers.size();i++)
		{
			boolean is = stuworkers.get(i).getIsWorking();		//store if student is working or not in "is"
			if(is == true)
			{
				ret.add(stuworkers.get(i));				//if true add it to ret
				
			}
	
		}
		return ret;
	}
	
	public StudentWorker search(int id)			//search method
	{
		int i=0;
		while(i<stuworkers.size())				//search the student worker in the whole stuworkers
		{
			if(id==stuworkers.get(i).getId())	//until a match occurs, then gets out of loop.
			{
				break;
			}
			else
			i++;
			
		}
		
		
		return stuworkers.get(i);
	}
	
	public String toString()					//toString method
	{
		return " "+stuworkers;
	}
}
