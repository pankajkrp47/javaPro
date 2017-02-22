class Dubplicate{
  
          public static void main(String args[])
		  {
			  String name[]={"pankaj","tamal","sanju","pankaj","tamal"};
			  for(int i=0;i<name.length;i++)
			  {
				  for(int j=i+1;j<name.length;j++)
					  if(name[i].equals(name[j]))
					  {
						  System.out.println("duplicate value:" +name[j]);
					  }
			  }
			  
			  
			  List<Integer> ob=new ArrayList<Integer>(new Comparable());
			               for(int i=0;i<10;i++)
						   {
							   ob.add(i);
						   }
			             ob.add(3);
					for(int i=0; i<ob.size();i++)
					{
						for(int j=i+1; j<ob.size(); j++)						
					}												
		  }
 
}