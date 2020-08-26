import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list=new LinkedList<String>();
LinkedList<String> list1=new LinkedList<String>();
list.add("abc");
list.add("def");
list.addFirst("john");
list.addLast("steve");
list.add(2,"jhut");
list1.add("1");
list1.add("2");
list1.addFirst("0");
list1.addLast("3");
list.addAll(list1);
System.out.println(list);
list.addAll(1,list1);
System.out.println(list);
//list1.clear();
//System.out.println(list1);
System.out.println(list.clone());
System.out.println(list.contains("2"));
System.out.println(list.get(1));
System.out.println(list.getFirst());
System.out.println(list.getLast());
System.out.println(list.indexOf("abc"));
System.out.println(list.lastIndexOf("3"));
list1.remove(1);
System.out.println(list1);
list1.remove("2");
System.out.println(list1);
list1.removeFirst();
list1.removeLast();
System.out.println(list1);
list.set(1,"10");
System.out.println(list);
Iterator<String> i=list.iterator();
/*while(i.hasNext())
{
	System.out.println(i.next());
}
for(int a=0;i.hasNext();a++)
{
	System.out.println(i.next());
}*/
}

	}


