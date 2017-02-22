import java.util.*;

class HashMapDemoo{

    public static void main(String args[])
	{
		HashMap m=new HashMap();
		        m.put("pankaj",100);
				m.put("tamal",101);
				m.put("sanju",102);
				System.out.println(m);
				Set s=m.keySet();
				System.out.println(s);
				Collection col=m.values();
				System.out.println(col);
				Set s1=m.entrySet();
				System.out.println(s1);
			Iterator its=s1.iterator();
			      //Listiterator its=s1.listiterator();
				  while(its.hasNext())
				  {
					  Map.Entry m1=(Map.Entry)its.next();
					  System.out.println(m1.getKey());
					  
				  }
	}
}