import java.util.*;
public class CollegeStudent implements Comparable<CollegeStudent> {
	String name;
	int a;
	CollegeStudent(String name,int age)
	{
		this.name=name;
		this.a=age;
	
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
	return a;
	}
	public int compareTo(CollegeStudent s)
	{
		if((this.name).compareTo(s.getName())>0)
		{
			return 1;
		}
		else if((this.name).compareTo(s.getName())>0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		}
	/*public int compareTo(CollegeStudent s)
	{
		return this.a-s.getAge();
	}*/
	
	public String toString()
	{
		String s1=new String();
		s1="[name="+this.name+" "+"age="+this.a+"]";
		return s1;
	}
	}
	

