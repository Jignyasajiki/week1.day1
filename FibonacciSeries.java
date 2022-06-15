package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=1,c ,i,d=8;
		
	  System.out.println(a+ "" +b);
	  
	  for(i=2;i<d;i++)
	  {
		  c=a+b;
		  System.out.println(""+c);
		  a=b;
		  b=c;
	  }
		

	}

}
