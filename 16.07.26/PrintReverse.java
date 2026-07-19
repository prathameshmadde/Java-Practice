import java.util.Scanner;
class  PrintReverse
{
	public static void main(String[] args) 
	{
		//Q Print a Given Number in Reverse order 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		int new1=0;
		int i=0;
		while(num!=0)
		{
			int last=num%10;
			
			new1 = new1*10 + last;
			
			num/=10;
		}
		System.out.println(new1);
	}
}