class A extends RuntimeException{
	   A(String a)
	   {
		   super(a);
	   }
}
class B extends RuntimeException
{
	B(String b)
	{
		super(b);
	}
}
class DemotestCheckedExction
    {
	  public static void main(String args[])
	  {
		   int arg=Integer.parseInt(args[0]);
		     if(arg>60)
			 {
				 throw new A("please Eneter vaue");
			 }
	  }
	}
