class CharArrayToString
           
		   {
		   public static void main(String args[])
		   {
			   char arr[]={'p','a','n','k','a','j'};
			   String s=new String(arr);
			   System.out.println(s);
			   // another method
			   String ss=String.valueOf(arr);
			   System.out.println(ss);
		   }
		  }