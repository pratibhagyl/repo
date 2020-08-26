import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadingFilein8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("d:\\filea.txt");
//		try
//		{
//			List<String> list=Files.readAllLines(path);
//			System.out.println(list);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		try
//		{
//			Stream<String> stream=Files.lines(path);
//			stream.forEach(System.out::println);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
try
{int count=0;
BufferedReader b=Files.newBufferedReader(path);
Stream stream=b.lines();
LineNumberReader r=new LineNumberReader(new FileReader(new File("d:\\filea.txt")));
		while(r.readLine()!=null)
		{
			System.out.println(r.getLineNumber());
			count++;
		}
		System.out.println(count);
	stream.forEach(System.out::println);
}
catch(Exception e)
{
e.printStackTrace();
}
//		try
//		{
//			Stream<String> stream=Files.lines(path);
//			stream.filter(line->!line.trim().equals("")).forEach(System.out::println);
//			
//		}
//		catch(Exception e)
//		{
//	e.printStackTrace();
//		}
//		
	}

}
