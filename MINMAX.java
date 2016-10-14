public class MINMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double large = Double.parseDouble(args[0]);			//takes first input as large
		double small = Double.parseDouble(args[0]);			//takes first unput as small
		for(int i=0;i<args.length;i++)						//loop runs as many tims as the inputs are entered
		{
			double a = Double.parseDouble(args[i]);			//a is next entered input
			
			if(a>large)										//if a is greater than large then 
			{
				large = a;									//we set large value to a
			}
			else											//else we keep large as it is
			{
				large = large;
			}
			
			
			if(a<small)										//if a is smaller than small then
			{
				small = a;									//we set small to value of a
			}
			else											//else we keep small as it is
				small = small;
			
		}
		
		
		System.out.println("Maximum value is "+large);
		System.out.println("Minimum value is "+small);
		
	}

}
