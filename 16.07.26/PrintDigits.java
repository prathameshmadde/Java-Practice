import java.util.Scanner;
class  PrintDigits
{
	public static void main(String[] args) 
	{
		//Q Print all digits of a Given Number . 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		
		int i=0;
		while(num!=0)
		{
			int last=num%10;
			
			System.out.println(last);
			
			num/=10;
		}
	}
}
