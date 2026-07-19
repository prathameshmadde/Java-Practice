import java.util.Scanner;

class XylemPalindrome 
{	//Q The given no must be the xylem and palindrome both 
	
	public static void main(String[] args) 
	{	Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int number=num;
		int ans =0;
		int sumofend=0;
		int sumofmid=0;
		int temp=num;
		
		while (num>0)
		{	
			int last = num%10;
			ans = ans *10 + last;
			num/=10;
		}
		
		if (ans == temp )
		{	
			sumofend = temp%10;
			temp/=10;
			while(temp>9){
				
				int last1=temp%10;
				sumofmid+=last1;
				temp/=10;
			}
			sumofend+=temp;
			
			if (sumofmid == sumofend)
			{	
				System.out.println(number +" Number is Palindrome and Xylem both .");
			}
			else
			{
			System.out.println(number + " Number is Palindrome but not Xylem.");
			}	
			
		}
		else
		{
			System.out.println(number +" This no is not Palindrome .");
		}
	}
}
