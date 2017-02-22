import java.util.*;
class HasmapDemo
{
	public static void main(String args[])
	{
		HashMap<Integer,String> ob=new HashMap<Integer,String>();
		            ob.put(1,"java");
					ob.put(2,".net");
					ob.put(3,"Php");
					ob.put(4,"Msql");
					Set s=ob.keySet();
					Collection c=ob.values();
					Set s1=ob.entrySet();
					Iterator itr=s1.iterator();
					while(itr.hasNext())
					{
						Map.Entry mp=(Map.Entry)itr.next();
						System.out.println(mp.getKey());
					}
				System.out.println(ob);
	}

}