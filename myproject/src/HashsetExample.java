import java.util.*;
public class HashsetExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		/*ArrayList<String>list3=new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		HashSet<String> list1=new HashSet<String>(list3);
		Set s = Collections.synchronizedSet(new HashSet());
		s.add(1);
		s.add(4);
		s.add(2);
		System.out.println(s);
		HashSet<String>list2=new HashSet<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("");
		list1.add(null);
		list2.addAll(list1);
		Iterator i=list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(list1);
		System.out.println("list2"+list2);
		list2.clear();
		System.out.println(list2);
		System.out.println(list1.clone());
		System.out.println(list2.isEmpty());
		System.out.println(list1.contains("1"));
		System.out.println(list1.contains(list2));
		System.out.println(list1.size());
		list1.remove(null);
		System.out.println(list1);
		HashSet<CollegeStudent>list4=new HashSet<CollegeStudent>();
		list4.add(new CollegeStudent("abc",25));
		list4.add(new CollegeStudent("def",21));
		list4.add(new CollegeStudent("ghi",28));
		list4.add(new CollegeStudent("jkl",22));
		list4.add(new CollegeStudent("mnop",20));
		Iterator i1=list4.iterator();
		while(i1.hasNext())
		{CollegeStudent s1=(CollegeStudent)i1.next();
			System.out.println("name:"+s1.name+"age:"+s1.a);
		}*/
		/*ArrayList<String>list3=new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		TreeSet<String> list1=new TreeSet<String>(list3);
		Set s = Collections.synchronizedSet(new TreeSet());
		s.add(1);
		s.add(4);
		s.add(2);
		System.out.println(s);
		TreeSet<String>list2=new TreeSet<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("");
		
		list2.addAll(list1);
		Iterator i=list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(list1);
		System.out.println("list2"+list2);
		list2.clear();
		System.out.println(list2);
		System.out.println(list1.clone());
		System.out.println(list2.isEmpty());
		System.out.println(list1.contains("1"));
		System.out.println(list1.contains("a"));
		System.out.println(list1.size());
		list1.remove("a");
		System.out.println(list1);
		TreeSet<CollegeStudent>list4=new TreeSet<CollegeStudent>();
		list4.add(new CollegeStudent("abc",25));
		list4.add(new CollegeStudent("def",21));
		list4.add(new CollegeStudent("ghi",28));
		list4.add(new CollegeStudent("jkl",22));
		list4.add(new CollegeStudent("mnop",20));
		Iterator i1=list4.iterator();
		while(i1.hasNext())
		{CollegeStudent s1=(CollegeStudent)i1.next();
			System.out.println("name:"+s1.name+"age:"+s1.a);
		}*/
		/*ArrayList<String>list3=new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		LinkedHashSet<String> list1=new LinkedHashSet<String>(list3);
		Set s = Collections.synchronizedSet(new LinkedHashSet());
		s.add(1);
		s.add(4);
		s.add(2);
		System.out.println(s);
		LinkedHashSet<String>list2=new LinkedHashSet<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("");
		list1.add(null);
		list2.addAll(list1);
		Iterator i=list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(list1);
		System.out.println("list2"+list2);
		list2.clear();
		System.out.println(list2);
		System.out.println(list1.clone());
		System.out.println(list2.isEmpty());
		System.out.println(list1.contains("1"));
		System.out.println(list1.contains(list2));
		System.out.println(list1.size());
		list1.remove(null);
		System.out.println(list1);
		LinkedHashSet<CollegeStudent>list4=new LinkedHashSet<CollegeStudent>();
		list4.add(new CollegeStudent("abc",25));
		list4.add(new CollegeStudent("def",21));
		list4.add(new CollegeStudent("ghi",28));
		list4.add(new CollegeStudent("jkl",22));
		list4.add(new CollegeStudent("mnop",20));
		Iterator i1=list4.iterator();
		while(i1.hasNext())
		{CollegeStudent s1=(CollegeStudent)i1.next();
			System.out.println("name:"+s1.name+"age:"+s1.a);
		}*/
		
		/*HashMap<Integer,String> list1=new HashMap<Integer,String>();
		HashMap<Integer,String>list2=new HashMap<Integer,String>();
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
		HashMap<Integer,CollegeStudent>list4=new HashMap<Integer,CollegeStudent>();
		list4.put(1,new CollegeStudent("abc",25));
		list4.put(2,new CollegeStudent("def",21));
		list4.put(3,new CollegeStudent("ghi",28));
		list4.put(4,new CollegeStudent("jkl",22));
		list4.put(5,new CollegeStudent("mnop",20));
		Set s3=list1.entrySet();
		Iterator i3=s3.iterator();
		while(i3.hasNext())
		{
			Map.Entry<Integer,CollegeStudent> m1=(Map.Entry)i3.next();

			CollegeStudent s5=m1.getValue();
			System.out.println("key value"+m1.getKey()+" "+"actual value"+s5.name+" "+s5.a);
		}*/
	/*SortedMap<Integer,String> list1=new TreeMap<Integer,String>();
		TreeMap<Integer,String>list2=new TreeMap<Integer,String>();
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
		//System.out.println(list1.clone());
		System.out.println(list2.isEmpty());
		list1.remove(6);
		//list1.remove(6,null);
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
		System.out.println(list1.keySet());
		System.out.println(list1.values());
		//Maintains descending order  
	      System.out.println("descendingMap: "+list1.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+list1.headMap(4,false));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+list1.tailMap(2,false));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+list1.subMap(1, false, 5, false));  
		//Maintains descending order  
	      
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+list1.headMap(4));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+list1.tailMap(2));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+list1.subMap(1,5));
		list1.replaceAll((k,V)->"hello");
		System.out.println(list1);
		System.out.println(list1.containsValue("hello"));
		System.out.println(list1.containsKey(1));
		System.out.println(list1.getOrDefault(1,""));
		TreeMap<Integer,CollegeStudent>list4=new TreeMap<Integer,CollegeStudent>();
		list4.put(1,new CollegeStudent("abc",25));
		list4.put(2,new CollegeStudent("def",21));
		list4.put(3,new CollegeStudent("ghi",28));
		list4.put(4,new CollegeStudent("jkl",22));
		list4.put(5,new CollegeStudent("mnop",20));
		Set s3=list1.entrySet();
		Iterator i3=s3.iterator();
		while(i3.hasNext())
		{
			Map.Entry<Integer,CollegeStudent> m1=(Map.Entry)i3.next();

			CollegeStudent s5=m1.getValue();
			System.out.println("key value"+m1.getKey()+" "+"actual value"+s5.name+" "+s5.a);
		}*/
		/*LinkedHashMap<Integer,String> list1=new LinkedHashMap<Integer,String>();
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
		Set s3=list1.entrySet();
		Iterator i3=s3.iterator();
		while(i3.hasNext())
		{
			Map.Entry<Integer,CollegeStudent> m1=(Map.Entry)i3.next();

			CollegeStudent s5=m1.getValue();
			System.out.println("key value"+m1.getKey()+" "+"actual value"+s5.name+" "+s5.a);
		}*/
		
	}

}
