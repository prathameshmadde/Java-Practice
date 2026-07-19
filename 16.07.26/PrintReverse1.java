import java.util.Scanner;
class  PrintReverse1
{
	public static void main(String[] args) 
	{
		//Q Print all digits of a Given Number digits order .
		
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
		
		while(new1!=0)
		{
			int last2=new1%10;
			
			System.out.println(last2);
			
			new1/=10;
		}
		
		
	}
}