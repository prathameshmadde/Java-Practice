import java.util.Scanner;

class  DigitCount
//Q Count the number of digits in a number.
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int count=0;
		
		if (num==0)
		{
			System.out.println("Total Number of Digit : 1 ");
			return;
		}
		
		for (int i=num; i!=0 ;i/=10 )
		{
			count++;
		}
		
		System.out.println("Total Number of Digit : "+ count);
			
	}
}
