
public class CustomizeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ValidateService v=new ValidateService();
	
	try {
		//v.validateNumber(50);
		v.validateString("hello");
	} catch (TooShortStringException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}

/*catch(Exception ex)
{
	if(ex instanceof SmallNumberException)
	{
		System.out.println("no. is not valid"+"\t"+ex);
	
	}
	else if(ex instanceof TooShortStringException)
	{
		System.out.println("string is not valid"+ex);
	}
	else
	{
		ex.printStackTrace();
	}
	
}*/
	}

}
