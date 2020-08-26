package com.abs.demo;

abstract class Phone {
public boolean turnOn()
{ return true;
}
public boolean turnOff()
{
	return false;
}
public abstract String setScreenResolution(String resolution);
}
class Android extends Phone
{

	@Override
	public String setScreenResolution(String resolution) {
		// TODO Auto-generated method stub
		//resolution="HD";
		return resolution;
	}
	
}
class Apple extends Phone
{

	@Override
	public String setScreenResolution(String resolution) {
		// TODO Auto-generated method stub
		//resolution="FHD";
		return resolution;
	}
	
}
public class Test
{
	public static void main(String[] args)
	{
		Android a=new Android();
		System.out.println(a.setScreenResolution("Hd"));
		Apple a1=new Apple();
		System.out.println(a1.setScreenResolution("FHd"));
	}
	
	
	
}