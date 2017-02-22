class DemoStatics
{
	static Clock ob=new Clock();
        public static void main(String ars[])
		{
			
			      ob.sayTime();
		}
}

class Clock{
	
	public void sayTime()
	{
		System.out.println("get Timing");
	}
}