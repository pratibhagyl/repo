class Test4
{int real;
int imag;
	
	public Test4(int i,int j)
	{
		real=i;
		imag=j;
	}
	public Test4(Test4 t,Test4 t7)
	{/*real=t.real;
	imag=t.imag;
		System.out.println(real+""+imag);*/
	real=t.real+t7.real;
	imag=t.imag+t7.imag;
		System.out.println(real+"+"+"i"+imag);
	}
}

public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test4 t1=new Test4(1,2);
Test4 t2=new Test4(3,4);
Test4 t3=new Test4(t1,t2);

	}

}
