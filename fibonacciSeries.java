import java.util.*;
class fibonacciSeries{
	public void m1(int num)
	{
		int a=0;
	   int b=1;
	   int c=0;
	   System.out.print(a +","+b);
	   for(int i=3;i<num;i++)
	   {
		   c=a+b;
		   System.out.print(","+c);
		   a=b;
		   b=c;
		   
	   }
	   
	}
	    public static void main(String args[])
		{    
		     Scanner sc=new Scanner(System.in);
		       int nu=sc.nextInt() ;
			fibonacciSeries ob=new fibonacciSeries();
			                  ob.m1(nu);
		    // System.out.print(","+ob.c);
		}
	   

}