import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class UniqueWordsin8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Path path=Paths.get("d:\\fileb.txt");
try {
	BufferedReader b=Files.newBufferedReader(path);
	Stream<String> stream=b.lines();
	stream.distinct().forEach(System.out::println);
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
