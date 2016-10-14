import java.util.ArrayList;

public class TestStudentWorkerDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentWorker s = new StudentWorker("Chris Diez","123456","true","25","true","11.0");	//adding student s
		StudentWorker d = new StudentWorker(" Diez","56","false","25","false","11.0");			//adding student d
		
		StudentWorkerDB list = new StudentWorkerDB();		//creating list object in StudentWorkerDB
		list.addStudentWorker(s);							//calling addStudentWorker s
		list.addStudentWorker(d);							//calling addStudentWorker d
		System.out.println("After adding all workers:");	
		System.out.println(list.toString());				//calling toString
		System.out.println("Searching with id number");
		System.out.println(list.search(56));				//calling search method
		System.out.println("Printing only work permitted studentworkers");
		System.out.println(list.workpermitted());			//calling workpermitted method
		
	}
	

}
