import java.io.*;
public class FlushExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int m;
		String s="i m ok";
		File f3=new File("d:\\learn3.txt");
		f3.createNewFile();
		
		FileWriter f2=new FileWriter(f3,true);
		BufferedWriter b2=new BufferedWriter(f2);
FileReader f1=new FileReader(f3);
		BufferedReader b1=new BufferedReader(f1);
		b2.append("hello how r u");
		b2.write("what about u");
		b2.flush();
		b2.append(s);
	//System.out.println(b1.read());
	while((m=b1.read())!=-1)
		{
			System.out.print((char)m);
		}
b2.close();

	}

}
