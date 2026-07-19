import java.util.Scanner;
class  EvenNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		
		int i=0;
		while(num!=0)
		{
			int last=num%10;
			
			if (last%2==0)
			{
				System.out.println(last);
			}
			
			num/=10;
		}
		
	}
}
