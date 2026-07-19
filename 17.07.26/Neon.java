import java.util.Scanner;
class Neon 
{	// Neon number : A number where sum of digit of it square is equal to the orignal itself . 
	//eg. orignal = 9  suare = 81.  8+1=9
	
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt(); 
		int orignal = num ;
		int square = num*num;
		int sum = 0;
		
		while (square>0)
		{
			int last = square%10;
			sum = sum + last;
			square/=10;
		}
		
		if (sum == orignal)
		{
			System.out.println(orignal + " Number is Neon Number .");
		}
		else{
			System.out.println(orignal + " Number is not Neon Number .");
		}
		
	}
}
