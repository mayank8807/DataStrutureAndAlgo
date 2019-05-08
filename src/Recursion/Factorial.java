package Recursion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	private static int factorial(int n)
	{
		if(n==0)
			return 1;
		
		return n* factorial(n-1);
	}
	
	public static void main(String[] args) 
	{
	
		try
		{
			System.out.println("Enter number for which factorial need to be calculated");
			int n = new Scanner(System.in).nextInt();
			
			if(n<0)
			throw new IllegalArgumentException();
			
			System.out.println("factorial for"+ n+" is :"+factorial(n));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Pleae input number /n  Please run Program again");
		}
	}

}

