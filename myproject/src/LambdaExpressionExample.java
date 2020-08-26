import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//interface IWork
//{
//	public void sayHello();
//}
//public class LambdaExpressionExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////IWork i=new IWork() {public void sayHello()
////	{
////	System.out.println("hello");
////	}};
//		IWork i=()->System.out.println("hello");
//
//i.sayHello();
//	}
//
//}

class IWork
{String name;
	//public String sayHello(String name);
public IWork(String name)
{
	this.name=name;
}

public String toString()
{
	return name;
}
}
public class LambdaExpressionExample  {

	public static void main(String[] args)  {

ArrayList<IWork> list=new ArrayList<IWork>();
list.add(new IWork("lukesh"));
list.add(new IWork("abcd"));
System.out.println(list);
//Collections.sort(list,new Comparator<IWork>()
//		{
//	public int compare(IWork w1,IWork w2)
//	{
//		return w1.name.compareTo(w2.name);
//		
//	}
//});
Collections.sort(list,(w1,w2)->(w1.name.compareTo(w2.name)));


System.out.println(list);
	}

}
