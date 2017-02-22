public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
        int arr[]={23,10,13,14,90,23};
                  // 13,23,24,90,34,25
                   
        
        	  for(int j=0;j<arr.length-2;j++)
        	  {
        		  if(arr[j]>arr[j+1])
        		  {
        			     temp=arr[j];
        			     arr[j]=arr[j+1];
        			     arr[j+1]=temp;
        		  }
        	  }
         
         for(int i=0;i<=arr.length-1;i++)
         {
        	 System.out.println(arr[i]);
         }
        
	}
}