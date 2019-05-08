package Recursion;
import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input lenght of string");
		int size = sc.nextInt();
		genrateString("",size);  // Initializing result string as empty
	}
	
	public static void genrateString(String sGenerated,int length)
	{
		//base case 
		if(length==1)
		{
			//for binary 2 values are possible at base case either 1 or 0
			System.out.println(sGenerated+0);   // adding 0 as base case and print 
			System.out.println(sGenerated+1);  //  adding 1 as base case and print
		}
		else
		{
			genrateString(sGenerated+0,length-1);  //add one possible value 0 and send for recursion
			genrateString(sGenerated+1,length-1);  // add one possible value 1 and send for recursion
		}
	}

}
