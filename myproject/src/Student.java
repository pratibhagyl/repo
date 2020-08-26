import java.util.*;
public class Student implements Comparable<Student>{
String name;
int age;
int rollno;
public Student(String a,int c)
{
	this.name=a;
	
	this.age=c;
}
/*public void setAge(int b)
{
	this.age=b;
}*/
public int getAge()
{
	return age;
}
public int compareTo(Student anotherstudent)
{
	return(this.age-anotherstudent.getAge());
}
public String toString()

{
	String formattedStudent=new String();
	formattedStudent="[ name= "+this.name+" age="+this.age;
	return formattedStudent;
	}
}
