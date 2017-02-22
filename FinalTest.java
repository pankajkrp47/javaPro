class A
{
	 int x=0;
	final static int y=1;
	 A()
	 {
		 x++;
		 y++;
	 }
		
}
class FinalTest
{
 public static void main(String args[])
 {
        
	    //System.out.println(ob.x+" "+ob.y);
		A ob1=new A();
		  System.out.println(ob1.x+" "+ob1.y);
		  A ob2=new A();
		  System.out.println(ob2.x+" "+ob2.y);
 }
}