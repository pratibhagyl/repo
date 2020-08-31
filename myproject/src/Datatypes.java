
public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a=true;
		//byte b= 100;
		short c=20;
		//c=b;
		byte b=(byte)c;
		//int d=123456789;
		long e=123456l;
		//e=d;
		int d=(int)e;
		//float f=12.123456789F;
		double g=12346789789.123456789;
		float f=(float)g;
		
		char h='d';
		//char h=(char)d;
		d=h;
		char i=25;
		String j="abc";
		
		//j=i;
		String k=new String("def");
		System.out.println(a);
		//System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println(g);
		System.out.println("h="+h);
		System.out.println(i);
		System.out.println("j="+j);
		System.out.println(k);
	}

}
