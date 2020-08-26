
 class Teacher {
	int t = 10;

	public void get() {
		System.out.println(t);
	}
}

public class TeacherMain extends Teacher {
	public static void main(String[] args)

	{
		TeacherMain t = new TeacherMain();
		t.get();
	}

}
