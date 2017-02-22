class BobbleSorting{

     public static void main(String args[])
	 {
		 int arr[]={42,40,10,35,67};
		 int temp;
		  for(int i=0;i<=arr.length-1;i++)
		  {
			  for(int j=0;j<arr.length-1;j++)
			  {
				  if(arr[j]>arr[i])
				  {
					  temp=arr[j];
					  arr[j]=arr[i];
					  arr[i]=temp;
				  }
			  }
			 
		  }
		  for(int k=0;k<arr.length-1;k++)
			 {
				 System.out.println(arr[k]);
			 }
		  
	 }
}