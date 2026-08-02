import java.util.Scanner;
class  Pattern11
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num = n*n;
		for (int i =1 ;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(num-- + " ");
				if(num<9) {System.out.print(" "); }
			}
			System.out.println();
		}
		
	}
}


/*
Pattern (n = 4)

16 15 14 13
12 11 10 9
8  7  6  5
4  3  2  1

Logic

Start:
num = n * n

Print numbers in decreasing order.

After every print:
num--

Condition

No condition required.

print(num--);
*/
