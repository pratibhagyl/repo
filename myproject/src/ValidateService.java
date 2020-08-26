
public class ValidateService {

	public void validateNumber(int n) throws SmallNumberException
	{
		if(n<=100)
		{
			throw new SmallNumberException("no. is too small");
		}
		System.out.println(n);
	}
	public void validateString(String str) throws TooShortStringException
	{
		if (str.length()<8)
		{
			throw new TooShortStringException(" characters are less than 8");
		}
		System.out.println(str);
	}
}
