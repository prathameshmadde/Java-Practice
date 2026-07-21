import java.util.Scanner;

class  Palindrome

{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int ans = 0;
		int temp=num;
		
		if (num < 0)
		{
		System.out.println("It is not Palindrome.");
		return;
		}
		
		while (num!=0)
		{
			int last = num%10;
			ans = ans*10+ last;
			num/=10;
		}
			
		if(temp==ans){
			System.out.println("It is Palidrome .");
		}
		else{
			System.out.println("It is not Palindrome .");
		}
	}
}
