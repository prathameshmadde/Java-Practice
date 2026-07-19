import java.util.Scanner;
class Buzz 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num = sc.nextInt();
		
		if (num%10==0 || num%7==0)
		{System.out.println("It is Buzz number.");
		}
		else{
			System.out.println("It is not Buzz number .");
		}
		
	}
}
