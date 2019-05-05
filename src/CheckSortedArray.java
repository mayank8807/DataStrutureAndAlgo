import java.util.Arrays;
import java.util.Scanner;
public class CheckSortedArray {

	public static boolean isSorted(int[] a, int index)
	{
		if(index==0)
			return true;
		
		else if(a[index]> a[index-1])
			return isSorted(a,index-1);
		return false;
			
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array elements seperated by space");
		String input = sc.nextLine();
		int[] inputInt = Arrays.stream(input.split(" ")).mapToInt(a->Integer.parseInt(a)).toArray();
		
		System.out.println("Given arrays is sorted :"+isSorted(inputInt,inputInt.length-1));
	}
}
