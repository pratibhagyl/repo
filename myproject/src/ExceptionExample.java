import java.util.Scanner;
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int a = 10, b = 0;
		int d[]=new int[3];
		try {

			int c;
			c = a / b;
			/*for(int i=0;i<10;i++)
			{
				d[i]=n.nextInt();
			}*/
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(a + b);

	}
}