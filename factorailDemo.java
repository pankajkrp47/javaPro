class factorailDemo
{
  public static void main(String args[])
  {
	  int num=5;
	int  factorail=fact(num);
	  System.out.println(factorail);
  }
  static int fact(int num)
  {   
      int output;
	  if(num==1)
	  {
		  return 1;
	  }
	  output=fact(num-1)*num;
	  return output;
		  
  }
 
}