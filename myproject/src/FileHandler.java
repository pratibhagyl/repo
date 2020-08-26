import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
public class FileHandler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileHandler h=new FileHandler();
		char r[]= {'h','e','l','l','o'};
		File f1=new File("d:\\learn2.txt");
		f1.createNewFile();
		FileWriter w1=new FileWriter(f1,true);
		FileReader f=new FileReader("d:\\learn.txt");
		BufferedWriter w2 =new BufferedWriter(w1);
		BufferedReader b=new BufferedReader(f);
		//char a='i';
		w2.write("abc");
		w2.append('i');
		for(int i=0;i<5;i++) {
		w2.write(r[i]);
		}
		w2.write(r[2]);
		w2.write("12345",0,3);
		
		//System.out.print(w2.write(a));
		/*int m;
		while((m=b.read())!=-1)
		{
		//System.out.println(m);
		System.out.print((char)m);
		
		}*/
		String myLine;
		while((myLine=b.readLine())!=null)
		{
		System.out.println(myLine);
		//System.out.println(b.readLine());
		w2.close();
		w1.close();
		}
	}
	}

