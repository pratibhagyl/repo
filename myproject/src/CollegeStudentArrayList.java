import java.util.*;
public class CollegeStudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<CollegeStudent> list=new ArrayList<CollegeStudent>();
list.add(new CollegeStudent("abc",25));
list.add(new CollegeStudent("def",21));
list.add(new CollegeStudent("ghi",28));
list.add(new CollegeStudent("jkl",22));
list.add(new CollegeStudent("mnop",20));
Collections.sort(list);
System.out.println(list);
System.out.println("\n\nafter sorting in reverse order");
//list.sort(Comparator.reverseOrder());
//Collections.sort(list,Collections.reverseOrder());
Collections.reverse(list);
System.out.println(list);
Iterator i1=list.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
String s1[]= {"agra","lucknow","paris"};
ArrayList<String> list1=new ArrayList<String>(Arrays.asList(s1));
System.out.println(list1);
String a[]=list1.toArray(new String[list1.size()]);
for(int i=0;i<list1.size();i++)
{
	System.out.println(a[i]);
}
	Collections.addAll(list1, s1);
	System.out.println(list1);
	ArrayList<String> list3=new ArrayList<String>();
	list3.add("hello");
	list3.add("how");
	Collections.addAll(list3,a);
	list3.addAll(list1);
	System.out.println(list3);
	System.out.println(list1);
	
	
	}

	

}
