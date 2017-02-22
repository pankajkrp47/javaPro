import java.util.*;
class HasSetDemo

{
	public static void main(String args[])
	{	HashSet ob=new HashSet();
	        ob.add("pankaj");
			ob.add("tamal");
			ob.add("sanhu");
			ob.add(8);
			ob.add(9);
			System.out.println(ob);
		//Iterator itr=ob.iterator();
			ListIterator itr=ob.listIterator();
			while(itr.hasNext())
			{
				Integer it=(Integer)itr.next();
				System.out.println(it);
			}
			}

}