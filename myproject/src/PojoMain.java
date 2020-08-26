
public class PojoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo p = new Pojo();
		p.setName("abc");
		String name = p.getName();
		System.out.println(name);
		p.setAddress("def");
		String address = p.getName();
		System.out.println("address is" + address);
		p.setMarks(100);
		int marks = p.getMarks();
		System.out.println(marks);
	}

}
