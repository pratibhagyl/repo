import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> list=new ArrayList<Student>();
list.add(new Student("john",19));
list.add(new Student("doe",24));
list.add(new Student("ghut",17));
list.add(new Student("abc",27));
System.out.println("before sort");
System.out.println(list);
Collections.sort(list);
System.out.println("after sort");
System.out.println(list);
String city[]= {"agra","mysore","chandigarh"};
ArrayList<String> s=new ArrayList<String>(Arrays.asList(city));
System.out.println(s);
	}

}
