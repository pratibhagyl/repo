import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[10];
		str[5]="HELLO HELLO";
		Optional<String> check=Optional.ofNullable(str[5]);
//		if(check.isPresent())
//		{
//		String str1=str[5].toLowerCase();
//		System.out.println(str1);
//		}
//		else
//		{
//			System.out.println("string is not present");
//		}
		//
		OptionalExample o=new OptionalExample();
		Integer value1=null;
		Integer value2=new Integer(20);
		Optional<Integer> a=Optional.ofNullable(value1);
		Optional<Integer> b=Optional.ofNullable(value2);
		System.out.println(o.sum(a, b));
	}
		
public Integer sum(Optional<Integer> a,Optional<Integer> b)
{
	System.out.println(a.isPresent());
	System.out.println(b.isPresent());
	Integer value1=a.orElse(new Integer(0));
	Integer value2=b.get();
	return value1+value2;
}

	

}
