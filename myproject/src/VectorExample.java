import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector list1=new Vector();
Vector list4=new Vector();
ArrayList list2=new ArrayList();
LinkedList list3=new LinkedList();
list1.add("hello");
list1.add("how");
list1.add("1");
list2.add("hello");
list2.add("how");
list2.add("1");
list2.add(2,"20");
list3.add("hello");
list3.add("how");
list3.add(0,"10");
list3.add("1");
list1.addElement("2");
list1.add(1,"3");
list1.add(0,"1");
System.out.println(list1);
list1.addAll(0,list2);
System.out.println(list1);
list1.addAll(list3);
System.out.println(list1);
list4.addAll(list1);
System.out.println("list4 elements:"+list4);

list4.clear();
System.out.println(list4);
System.out.println(list1.clone());
System.out.println(list1.contains(1));
list1.ensureCapacity(20);
System.out.println(list1.capacity());
System.out.println(list1.get(2));
System.out.println(list1.indexOf(1));
System.out.println(list1.lastIndexOf(1));
System.out.println(list4.isEmpty());
list1.remove(1);
System.out.println(list1);
list1.removeElement(1);
System.out.println(list1);
list4.addAll(list1);
//System.out.println("list3"+list3);
//list1.removeAll(list3);
//System.out.println(list1);
System.out.println(list1.equals(list4));
System.out.println(list1.firstElement());
System.out.println(list1.lastElement());
System.out.println(list1.capacity());
list1.trimToSize();
System.out.println(list1.capacity());
System.out.println(list1.toString());
System.out.println(list1.size());
String a[]=(String[])list1.toArray(new String[list1.size()]);
for(int i=0;i<list1.size();i++)
{
	System.out.println("array elements"+a[i]);
}
list1.setSize(20);
System.out.println(list1.size());
list1.setElementAt("4", 0);
System.out.println(list1);
list1.retainAll(list3);
System.out.println(list1);
System.out.println(list4.lastElement());
System.out.println(list4.size());
list4.removeAllElements();
System.out.println(list4.size());
list1.copyInto(a);
for(int i=0;i<list1.size();i++)
{
	System.out.println("array elements"+a[i]);
}
list1.insertElementAt("aa", 0);
System.out.println(list1);
list1.setElementAt("bb", 0);
System.out.println(list1);
System.out.println(list1.containsAll(list4));
System.out.println(list1.elementAt(0));

	}

}
