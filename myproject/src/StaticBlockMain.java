class StaticBlock
{
	static
	{
		System.out.println("file exist");
	}
StaticBlock()
{
System.out.println("constructor");	
}
}
public class StaticBlockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticBlock b=new StaticBlock();
	}

}
