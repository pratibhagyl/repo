import java.awt.List;
import java.util.ArrayList;

//lambda expression
/*interface GreetingMessage
{
	public void message(String message);

}
public class Java8Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingMessage gm=message->System.out.println(message);
		GreetingMessage gm1=(message)->System.out.println(message);
		gm.message("Hello");
		gm1.message("how r u");
	}

}*/

//method Reference1.reference to static method
/*interface M
{
	public void say();
}
class MethodReferenceExample
{
	public static void get()
	{
		System.out.println("this is  a static method");
	}
}
public class Java8Example {
	public static void main(String[] args) {
		M a1=MethodReferenceExample::get;
		a1.say();
		
}
}*/
//method Reference2.reference to instance method
/*interface M
{
	public void say();
}
class MethodReferenceExample
{
	public void get()
	{
		System.out.println("this is  an instance method");
	}
}
public class Java8Example {
	public static void main(String[] args) {
		MethodReferenceExample m1=new MethodReferenceExample();
		M a1=m1::get;
		a1.say();
		
}
}*/
////method Reference3.reference to constructor using new
/*interface M
{
	public void get(String msg);
}
class MethodReferenceExample
{
	MethodReferenceExample(String msg)
	{
		System.out.println(msg);
	}
}
public class Java8Example {
	public static void main(String[] args) {
		M a1=MethodReferenceExample::new;
		a1.get("hello");
		
}
}*/
public class Java8Example {
	public static void main(String[] args) {
ArrayList<String> names =new ArrayList<String>(); 
names.add("Krish"); 
names.add("John"); 
names.add("Doe");
names.add("Kim");
names.add("Bill"); 
names.forEach(System.out::println);
	}
}