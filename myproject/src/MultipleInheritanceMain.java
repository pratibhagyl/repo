interface MultipleInheritance1
{String name="abc";
	int add(int a ,int b);
}
interface MultipleInheritance2 
{String name1="def";
int sub(int a ,int b);
}
class MultipleInheritance3 implements MultipleInheritance1,MultipleInheritance2
{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
}

public class MultipleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance3 m=new MultipleInheritance3();
		System.out.println(m.add(10, 20));
		System.out.println(m.sub(50, 40));
		System.out.println(m.name);

	}

}
