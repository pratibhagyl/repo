package principal.teachers.students;

public class MyAccount {
int bal=0;
protected int intGetConsolidatedBal()
{
int consolidatedBal=0;
int savings=getSavingsBal();
int cheq=getCheqBal();
int cc=getCreditCardBal();
consolidatedBal=savings+cheq-cc;
return consolidatedBal;
}
private int getSavingsBal()
{
	return 100;
}
private int getCheqBal()
{
	return 50;
}
private int getCreditCardBal()
{
	return 25;
}
}
