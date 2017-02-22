class CheckedExcpetion
{
     public static void main(String args[])
	 {
		 System.out.println(10/0);
		 throw new ArithmeticException();
		 System.out.println("ii");
	 }
}