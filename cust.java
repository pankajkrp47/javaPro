
class A extends RuntimeException {

	
	A(String s)
	{
		super(s);
	}
}
class cust{
	
	public static void main(String args[])
	{
		int name=Integer.parseInt(args[0]);
		if(name>20)
		{
			System.out.println("hi");
			throw new A("/name not found");
			
		}
	}
}