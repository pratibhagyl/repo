import java.util.Scanner;

import java.util.*;
public class First {

	public static void main(String[] args) {
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	Scanner n= new Scanner(System.in);
	System.out.println("enter the elements");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=n.nextInt();
		}
	}
	System.out.println("enter the elements");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			b[i][j]=n.nextInt();
		}
	}
		
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+"\t");
		}
		System.out.print("\n");
	}
			
	}
}
