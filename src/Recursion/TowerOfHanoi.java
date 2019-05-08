package Recursion;

public class TowerOfHanoi {

	public static void TOH(int n,char from, char to , char aux)
	{
		if(n==1){
			System.out.println("moving disk 1 from "+from+" to "+to );
			return;
		}
		else
		{
			//move n-1 disk to Aux 
			//then move nth disk to to
			//move n-1 disk to to
			
			TOH(n-1,from, aux, to);
			System.out.println("moving "+n+" disk to from"+from + " to" + to);
			TOH(n-1, aux, to, from);
			
		}
		
		
	}
	public static void main(String[] args) {
		
		TOH(4, 'A','B','C');
	}

}
