import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class ThreadA extends Thread {
	public void run()
	{
		try
		{
		File f=new File("d:\\learn1.txt");
		FileReader f1=new FileReader(f);
		BufferedReader b1=new BufferedReader(f1);
		File f2=new File("d:\\filea.txt");
		f2.createNewFile();
		FileWriter f3=new FileWriter(f2);
		BufferedWriter b2=new BufferedWriter(f3);
		String line;
		int lno=0;
		while((line=b1.readLine())!=null)
		{
			lno++;
			if(lno%2==0)
			{System.out.println("Thread A"+line);
			b2.write(line+"\n");
			
			}
			else {}
			}
		b2.close();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
}

