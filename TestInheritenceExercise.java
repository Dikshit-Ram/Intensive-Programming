
public class TestInheritenceExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object in StudentWorker
		StudentWorker s = new StudentWorker("Chris Diez","123456","true","25","false","11.0");

		System.out.println(s.toString());		//toString method called
		System.out.println(s.getName());		//getName method called
		System.out.println(s.getId());			//getId method called
		System.out.println(s.getPayRate());		//getPayRate called
		s.setPayRate(18.00);					//payrate method called
		System.out.println(s.toString());		//toString method called again
	}

}
