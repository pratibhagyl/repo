import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintStream;
import java.io.FileOutputStream;
interface Customer {
	public int setCustomer(String name,String address);
		
}

interface PaymentMethod {
	public void creditCard();

	public void debitCard();
}

class Product {
static String s;
	public int productType()
	{
		System.out.println("enter the product u want to buy tv/phone");
		Scanner n=new Scanner(System.in);
		String type=n.next();
		if(type.equals("tv"))
		{
			if((s=modelNameTv()).equals("samsungtv"))
		
			{
				return 500;
		}
			else
			{ 
				return 800;
			}
		}
			else
			{
				
				if((s=modelNamePhone()).equals("samsungphone"))
				{
					return 1000;
			}
				else
				{
					return 1200;
		}
			}
}
	public String modelNameTv()
	{
		System.out.println("which model you want to buy samsungtv/lgtv");
		Scanner n1=new Scanner(System.in);
		return n1.next();
	}
	public String modelNamePhone()
	{
		System.out.println("which model you want to buy samsungphone/ApplePhone");
		Scanner n2=new Scanner(System.in);
		return n2.next();
		
	}
}
class ShoppingCart extends Product implements Customer,PaymentMethod
{
	public int setCustomer(String name,String address)
	{
	System.out.println("enter membership type regular/premium");
	Scanner n = new Scanner(System.in);
	String type = n.next();
	if(type.equals("regular"))
	{
	return 10;
	}
	else 
	{
		return 0;
	}
}
	public void creditCard() {
		System.out.println("follow the instructions with credit card");
	}
	public void debitCard() {
		System.out.println("follow the instructions with debit card");
	}
	public void checkoutMethod(PrintStream p)
	{float c=0.0f;
	String s[]=new String[10];
	int price[]=new int[10];
	int e=setCustomer("abhi","Brampton");
	//System.out.println("ordered details");
	for(int i=0;i<2;i++)
	{
		price[i]=productType();
	 c=c+price[i];
	 s[i]=Product.s;	
		}
	p.println("product details");
	for(int i=0;i<2;i++)
	{
		p.println(s[i]+"\t"+price[i]);
	}
	p.println("total price="+c+"$");
	p.println("shipping="+e+"$");
	p.println("with 13% HST");
	float d=c+(13*c)/100+e;
	p.println("total Amount to be paid="+d+"$");
}
}
public class OnlineShoppingSite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int c=0;
//Customer c1=new Customer("abhi","Brampton");
ShoppingCart p=new ShoppingCart();
BufferedReader b=null;
File f1=new File("d:\\Output.txt");

FileOutputStream w1=new FileOutputStream(f1);
FileReader f=new FileReader("d:\\Output.txt");
PrintStream w2 =new PrintStream(w1);
b=new BufferedReader(f);
p.checkoutMethod(w2);
String myLine;
while((myLine=b.readLine())!=null)
{
	
	System.out.println(myLine);
}



System.out.println("enter payment method credit/Debit");
Scanner n=new Scanner(System.in);
String type=n.next();
if(type.equals("credit"))
{
	p.creditCard();
}
else
{
	p.debitCard();
}
}

}

