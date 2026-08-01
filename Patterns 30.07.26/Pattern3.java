import java.util.Scanner;

class  Pattern3
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = sc.nextInt();
		System.out.println("Enter no  : ");
		int num = sc.nextInt();
		
		int a = num;
		for (int i=1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ; j++)
				
			{
				System.out.print(a + " ");
				if(a<10) System.out.print(" ");
				a+=num;
			}
			System.out.println();
		}
	}
}