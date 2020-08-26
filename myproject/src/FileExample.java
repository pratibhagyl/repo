import java.io.File;
public class FileExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileExample f1=new FileExample();
		File f2=new File("d:\'hello1.txt'");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
		f2.delete();
		System.out.println(f2.exists());
		File f3=new File("g:\'hello2.txt'");
		System.out.println(f3.exists());
		f3.createNewFile();
		System.out.println(f3.exists());
		

}
}