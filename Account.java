
public class Account {

	String type;
	int bal=0;
	public void deposit(int amount)
	{
		bal=bal+amount;
	}
	public void withdrawl(int amount)
	{
		bal=bal-amount;
	}
	public int checkBal()
	{
		return bal;
	}
}
