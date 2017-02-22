class A{
   public void m1()throws Exception 
   {
      System.out.println("hii");
   }
}
class B extends A 
{
    public void m1()throws RuntimeException 
	{
		System.out.println("hello");
	}
}
class DemoExcptiontest{
    public static void main(String arg[])
	{
		A ob=new A();
		B ob2=new B();
	}

    }