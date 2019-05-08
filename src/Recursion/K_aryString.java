package Recursion;
//This program all possible string for given length using values between 0 , 1 ...K
//Recursion is used to generate output.
// base case will be string of length 1 , when we will have string for each possible value.
import java.util.Scanner;

public class K_aryString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		// getting possible value of K
		System.out.println("Enter the vlaue of K ( for given value of K , String will be generated using 0- K);");
		int k = sc.nextInt();
		// getting size of string which need to be generated
		System.out.println("Please provide length of String which need to be generated:");
		int length = sc.nextInt();
		generate("",length,k);
	}
	
	public static  void generate(String sGegerated, int length, int k)
	{
		//base case
		if(length<1)
		{
				System.out.println(sGegerated);  
		}
		
		else
		{
			for(int i=0; i<=k;i++)// add all possible values of K
			{
				generate(sGegerated+i,length-1,k);
			}
		}
	}

}
