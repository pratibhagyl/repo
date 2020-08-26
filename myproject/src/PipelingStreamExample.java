import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PipelingStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*ArrayList<String> list=(ArrayList<String>)Arrays.asList("abc","def"," ","ghi"," "," ","def");
	ArrayList<String> list1=(ArrayList<String>) list.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
	list1.forEach(System.out::println);*/
//	List<String> list=Arrays.asList("abc","def"," ","ghi","","","def");
//	List<String> list1= list.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
//	//list1.forEach(System.out::println);
//	Random n=new Random();
//	n.ints().limit(10).forEach(System.out::println);
//	List<Integer> list2=Arrays.asList(1,2,3,4,2,1,6);
//	List<Integer> list3= list2.stream().map(i->i*i).distinct().collect(Collectors.toList());
//	list3.forEach(System.out::println);
//	List<String> list=Arrays.asList("abc","def","","ghi","","","def");
//	long count= list.stream().filter(string->string.isEmpty()).count();
//	System.out.println(count);
//	Random n=new Random();
//n.ints().limit(10).sorted().forEach(System.out::println);
//List<String> list=Arrays.asList("abc","def","","ghi","","","def");
//long count= list.parallelStream().filter(string->string.isEmpty()).count();
//System.out.println(count);
//List<String> list=Arrays.asList("abc","def","","ghi","","","def");
//List<String> list1= list.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
////list1.forEach(System.out::println);
//System.out.println(list1);
//String mString=list.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));
//list1.forEach(System.out::println);
//System.out.println(mString);
List<Integer> list2=Arrays.asList(1,2,3,4,2,1,6);
IntSummaryStatistics stats=list2.parallelStream().mapToInt(x->x).summaryStatistics();
System.out.println(stats.getMin());
System.out.println(stats.getMax());
System.out.println(stats.getSum());
System.out.println(stats.getAverage());
	}

}
