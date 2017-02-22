class TestDTM{
	   public static int  i=0;
       public int j=1;
	   TestDTM()
	   {
		   i++;
		   j++;
	   }
}
class DemoException
{
    public static void main(String args[])
	{
		TestDTM ob1=new TestDTM();
		System.out.println(ob1.i);
		System.out.println(ob1.j);
		TestDTM ob2=new TestDTM();
	    System.out.println(ob2.i);
        TestDTM ob3=new TestDTM();
		System.out.println(ob3.i);
		    TestDTM ob4=new TestDTM();
		System.out.println(ob4.i);
		  TestDTM ob5=new TestDTM();
		System.out.println(ob5.j);
		TestDTM ob6=new TestDTM();
		System.out.println(ob6.j);
	}
}