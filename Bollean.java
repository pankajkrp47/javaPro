class Bollean{

public static void main(String ags[])
{
	Boolean ob=new Boolean("Yes");
	Boolean ob2=new Boolean("No");
	Boolean ob3=new Boolean(true);
	//Boolean ob4=new Boolean(True);
	Boolean ob5=new Boolean("True");
	System.out.println(ob.equals(ob2));
	System.out.println(ob==ob2);
	System.out.println(ob);
	System.out.println(ob2);
	System.out.println(ob3);
		//System.out.println(ob4);
		System.out.println(ob5);
}

}