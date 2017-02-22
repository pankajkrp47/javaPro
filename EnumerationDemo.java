import java.util.*;
class EnumerationDemo{
public static void main(String args[])
{
	Vector vs=new Vector();
	     for(int i=0; i<10; i++)
		 {
			 vs.addElement(i);
			 
		 }
		 System.out.println(vs);
		 Enumeration e=vs.elements();
		   while(e.hasMoreElement())
		   {
			   Integer i=(Integer)e.nextElement();
			   if(i%2==0)
			   {
				   System.out.println(i);
			   }
			   System.out.println(vs);
		   }
}

}