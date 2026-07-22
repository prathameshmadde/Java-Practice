import java.util.Scanner;

class SumofDigits 
//Q Find the sum of digits of a number.
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num<0){
			num=-num;
		}
		
		for (int i=num ; i!=0 ; i/=10 )
		{	int last = i%10;
			sum+=last;
		}
			
		System.out.println("Sum of Digits = "+sum);
	}
}
