import java.util.Scanner;

class  Pronic

{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		for (int i=1;i*(i+1)<=num ;i++ )
		{
			if (i* (i+1)==num)
			{
				System.out.println("Pronic Number .");
				return;
			}
				
		}
		System.out.println("It is not Pronic Number .");
		
			
	}
}
