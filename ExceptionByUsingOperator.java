
class ExceptionByUsingOperator
{
 public static void main(String args[])
 {
	 try
	 {
		  System.out.println(10/0);
	
	 }
	 catch(ArrayIndexOutOfBoundsException|ArithmeticException|ClassCastException e)
	 {
		 System.out.println(e);
	 }
	 
   
 }
}