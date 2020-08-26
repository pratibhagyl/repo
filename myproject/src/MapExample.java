import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String> h= new LinkedHashMap<Integer,String>();
h.put(2,"abc");
h.put(5,"abc");
h.put(4,"abc");
h.put(3,"abc");
h.put(2,"def");
h.put(1,null);
Set s=h.entrySet();

Iterator i=s.iterator();
while(i.hasNext())
{Map.Entry m=(Map.Entry)i.next();
	System.out.println(m.getKey());
	System.out.println(m.getValue());
}

	}

}
