
public class Triangle {
		int a;
		int b;
		int c;
		public Triangle(int newa,int newb,int newc){
		a=newa;
		b=newb;
		c=newc;
		}

		public boolean isTriangle()
		{
		if(a>0&&b>0&&c>0&&(a+b>c)&&(a+c>b)&&(b+c>a)){
		return true;
		}
		return false;

		}
}
