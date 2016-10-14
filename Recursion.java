import java.util.Arrays;

class Recursion {

       

        public static void main(String args[]) {

           // int [] [] a = new int [2][2];
            int [] [] a={{3,5},{6,10}};
        	printRowSum(a);

        }
        

        public static void printRowSum(int[][] a)
        {
        	int [][]b = new int [a.length][a[0].length];
        	
        	int s =0;
        	for(int i =0;i<a.length;i++)
        	{
        		int sum = 0;
        		for(int j=0;j<a[i].length;j++)
        		{
        			
        			sum = sum+a[i][j];
        			s = sum;
        		}
        		
        		b[i][0] = i;
        		b[i][1] = s;
        		
        	}
        
        	for(int i =0;i< b.length;i++)
        	{
        		for(int j =0;j<2;j++)
        		{
        			System.out.print(" "+b[i][j]);
        		}
        		System.out.println();
        	}
    }
}