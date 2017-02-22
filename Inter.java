class  A
{
   public void m1()
   {
	   System.out.println("parent");
   }
}

class  B extends A{
	public void m1()
	{
		System.out.println("Child");
	}
}

class Inter{
	public static void main(String args[])
	{
		A ob1=new A();
		  ob1.m1();
		B ob2=new B();
          ob2.m1();
         A ob3=new B();
           ob3.m1();		 
		
	}
}
