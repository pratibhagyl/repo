import java.util.Iterator;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> list1=new LinkedHashMap<Integer,String>();
		LinkedHashMap<Integer,String>list2=new LinkedHashMap<Integer,String>();
		list1.put(1,"1");
		list1.put(2,"2");
		list1.put(3,"3");
		list1.put(4,"4");
		list1.put(5,"");
		list1.put(6,null);
		list2.putAll(list1);
		System.out.println(list1);
		System.out.println("list2"+list2);
		System.out.println(list1.get(4));
		list2.clear();
		System.out.println(list2);
		System.out.println(list1.clone());
		System.out.println(list2.isEmpty());
		list1.remove(6,null);
		list1.replace(5,"abc");
		
		Set s1=list1.entrySet();
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			Map.Entry m=(Map.Entry)i1.next();
			System.out.println("key value"+m.getKey()+" "+"actual value"+m.getValue());
		}
		list1.replace(5,"abc","def");
		System.out.println(list1);
		list1.putIfAbsent(7, "Gaurav");
		Set s2=list1.entrySet();
		Iterator i2=s2.iterator();
		while(i2.hasNext())
		{
			Map.Entry m1=(Map.Entry)i2.next();
			System.out.println("key value"+m1.getKey()+" "+"actual value"+m1.getValue());
		}
		list1.replaceAll((k,V)->"hello");
		System.out.println(list1);
		System.out.println(list1.containsValue("hello"));
		System.out.println(list1.containsKey(1));
		System.out.println(list1.getOrDefault(1,""));
		System.out.println(list1.keySet());
		System.out.println(list1.values());
		System.out.println(list1.entrySet());
		LinkedHashMap<Integer,CollegeStudent>list4=new LinkedHashMap<Integer,CollegeStudent>();
		list4.put(1,new CollegeStudent("abc",25));
		list4.put(2,new CollegeStudent("def",21));
		list4.put(3,new CollegeStudent("ghi",28));
		list4.put(4,new CollegeStudent("jkl",22));
		list4.put(5,new CollegeStudent("mnop",20));
		Set s3=list4.entrySet();
		Iterator i3=s3.iterator();
		while(i3.hasNext())
		{
			Map.Entry<Integer,CollegeStudent> m1=(Map.Entry)i3.next();
			//System.out.println(m1.getValue());
CollegeStudent s5=m1.getValue();
			System.out.println("key value"+m1.getKey()+" "+"actual value"+s5.name+" "+s5.a);
		}
	}

}
