import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=Arrays.asList("abc","","bc","efg","abcd","","jkl");
List <String> filtered=list.parallelStream().filter(string->!string.isEmpty()).collect(Collectors.toList());
	System.out.println(filtered);
	}
	

}
