import java.util.Scanner;
class Pattern13 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows  : ");
		int n = sc.nextInt();
		System.out.println("Enter no of TAble you want : ");
		int num = sc.nextInt();
		int a =n*n;
		
		for (int i=1; i<=n ;i++ )
		{
			for (int j=1; j<=n ;j++ )
			{
				System.out.print(num*a + " ");
				if(num*a <10){ System.out.print(" "); }
				a--;
				
			}
			System.out.println();
		}
		
	}
}

/*
Pattern (n = 3, Table = 3)

27 24 21
18 15 12
9  6  3

Logic

Start:
a = n * n

Print:
num * a

After every print:
a--

Condition

No condition required.

print(num * a);
a--;
*/