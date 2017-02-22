class reverse{

 public static void main(String args[])
 {
	 String s="pankaj";
	 char ch[]=new char[s.length()];
	 for(int i=0; i<s.length();i++)
	 {
		 ch[i]=s.charAt(i);
		  
	 }
	 for(int j=s.length()-1; j>=0; j--)
		  {
			  System.out.print(ch[j]);
		  }
	 
	 
	 String sb="Tamal";
	   char a[]=sb.toCharArray();
	      for(int i=sb.length()-1; i>=0; i--)
		  {
			  System.out.print(a[i]);
		  }
 }
}