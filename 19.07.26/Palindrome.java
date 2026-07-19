import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int temp = num;
		int ans =0;
		
		while (num!=0)
		{
			int last = num%10;
			ans = ans * 10 + last ;
			num/=10;
			
		}
		
		if (temp==ans)
		{
			System.out.println(temp + " number is Palindrome .");
		}else{
			System.out.println(temp + " number is not Palindrome .");
		}
		
		
	}
}
