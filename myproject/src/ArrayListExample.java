import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.*;
class Employee
{
	int age,rollno;
	String name;
	Employee(String n,int a,int b)
	{
		this.age=a;
		this.rollno=b;
		this.name=n;
	}
}
public class ArrayListExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream f2=new FileOutputStream ("d:\\arraylist.txt");
		ObjectOutputStream b1=new ObjectOutputStream (f2);
		FileInputStream f3=new FileInputStream ("d:\\arraylist.txt");
		ObjectInputStream b2=new ObjectInputStream (f3);
ArrayList<String> list=new ArrayList<String>();
ArrayList<String> list1=new ArrayList<String>();
ArrayList<String> list2=new ArrayList<String>();
ArrayList<Employee> list3=new ArrayList<Employee>();
Employee s1=new Employee("Employee1",1,20);
Employee s2=new Employee("Employee2",2,21);
Employee s3=new Employee("Employee3",3,22);
list3.add(s1);
list3.add(s2);
list3.add(s3);
list.add("ghi");
list.add("abc");
list.add("def");
list.add(2,"hello");
list1 .add("ravi");
list1.add("soonat");
list1.add("ghi");
list2.add("john");
list2.add("rahul");
//list.add("ghi");
//list.addAll(list1);
list.addAll(1,list2);
//list2.clear();
System.out.println(list2);
/*System.out.println(list2.isEmpty());
System.out.println(list.lastIndexOf("def"));
System.out.println(list.clone());
System.out.println(list.contains("rahul"));
System.out.println(list.indexOf("def"));
System.out.println(list.set(2,"come in"));*/
b1.writeObject(list);
b1.close();
ArrayList list4=(ArrayList)b2.readObject();
//System.out.println(list4);

//System.out.println(list1.replaceAll(list2));
//System.out.println(list.removeAll("ghi")));
String arr[]=list.toArray(new String[list.size()]);
System.out.println(arr[0]);
//Collections.sort(list);
/*for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i));
}
System.out.println("\n\n");

Collections.sort(list,Collections.reverseOrder());
list.remove("def");*/
/*for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i));
}*/
//list.removeAll(list1);
//System.out.println(list);
/*list.removeIf(str->str.contains("rahul"));
System.out.println(list);
list.retainAll(list1);
System.out.println(list);
list.add(0,"how");
System.out.println(list.get(0));
list.set(0,"you");
System.out.println(list.get(0));
System.out.println(list);
System.out.println(list.get(1));
System.out.println(list.clone());
//list.removeRange(0,1);

Iterator<Employee> itr=list3.iterator();
/*while(itr.hasNext())
{ Employee s4=(Employee)itr.next();
System.out.println(s4.name+" "+s4.age+" "+s4.rollno);
	}*/

}

}
