import java.io.File;
import java.io.IOException;
class FileDemo
{
	public static void main(String args[])
	{
		File f=new File("abc.txt");
		System.out.println(f.exists());
	 try {
		f.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(f.exists());

	}
	}
