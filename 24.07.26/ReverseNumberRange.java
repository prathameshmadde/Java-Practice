import java.util.Scanner;

class ReverseNumberRange 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Start  : ");
		int start = sc.nextInt();
		System.out.println("Enter a End : ");
		int end = sc.nextInt();
		
		for (int i =start ; i < end ; i++ )
		{   int ans = 0; 
			for(int num = i ; num != 0 ; num/=10){
				int last = num%10;
				ans = ans*10 + last;
				
			}
			System.out.println(ans);
		}
		
	}
}
