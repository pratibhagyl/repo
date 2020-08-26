
public class ConstructorExample {
	String n;
int no;
public ConstructorExample()
{
	System.out.println("Constructor with no args");
}
public ConstructorExample( String name)
{n=name;
	System.out.println("Constructor with  1 arg"+n);
}
protected ConstructorExample( String name, int a)
{n=name;
no=a;
	System.out.println("Constructor with  2 args"+n+"no. is"+no);
}
}

