import java.util.Scanner;

class  PositiveNegative

{//Q Check whether a number is Positive, Negative, or Zero.
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		if (num==0)
		{System.out.println("It is Zero ");
		}
		else if (num>0)
		{System.out.println("It is positive ");
		}
		else
		{	System.out.println("It is Negative .");
		}
		
			
	}
}
