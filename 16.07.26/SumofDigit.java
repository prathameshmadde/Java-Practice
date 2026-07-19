import java.util.Scanner;
class  SumofDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		
		int i=0;
		
		int count=0;
		while(num!=0)
		{
			int last=num%10;
			count+=last;
			
			num/=10;
		}
		System.out.println(count);
		
		
	}
}
