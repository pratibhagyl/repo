package com.abs.demo;
abstract class A
{
	public abstract void add(int a,int b);

}
abstract class B extends A
{
	public abstract void sub(int a,int b);
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

}
public class TwoAbsClasses extends B{

	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoAbsClasses t=new TwoAbsClasses();
		t.add(10, 20);
		t.sub(50,40);
	}

}
