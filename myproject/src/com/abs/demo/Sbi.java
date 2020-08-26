package com.abs.demo;

abstract class AbsDemo {

	public abstract int principal();

	public abstract int rate();

	public abstract int time();

	public void interest(int p, int r, int t) {
		int interest = (p * r * t) / 100;
		System.out.println("interest=" + interest);
	}
}

class Federal extends AbsDemo {
	public int principal() {
		return 2000;
	}

	public int rate() {
		return 12;
	}

	public int time() {
		return 2;
	}
}
class Sbi extends AbsDemo
{
	public int principal() {
		return 3000;
	}

	public int rate() {
		return 13;
	}

	public int time() {
		return 3;
	}
		public static void main(String[] args)
		{
			Federal f=new Federal();
			int a=f.principal();
			int b=f.rate();
			int c=f.time();
			f.interest(a,b,c);
			Sbi s=new Sbi();
			int d=s.principal();
			int e=s.rate();
			int g=s.time();
			s.interest(d,e,g);
		}
		
}