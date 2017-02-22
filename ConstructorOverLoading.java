class ConstructorOverLoading
{
    ConstructorOverLoading(double d)
	{
		this(10);
		System.out.println("double");
	}
	ConstructorOverLoading(int i)
	{
		this();
		System.out.println("int");
	}
	ConstructorOverLoading()
	{
		System.out.println("no-arguments");
	}
public static void main(String args[])
{
	ConstructorOverLoading t1=new ConstructorOverLoading(10.3);
	//ConstructorOverLoading t2=new ConstructorOverLoading(10);
	//ConstructorOverLoading t3=new ConstructorOverLoading();
}	
}