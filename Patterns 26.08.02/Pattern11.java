import java.util.Scanner;

class  Pattern11
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		
		for (int i =1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ; j++ )
			{
				if (i==1 || j==1 || i==n || j==n || i==n-2 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/*
Pattern (n = 10)

* * * * * * * * * *
*                 *
*                 *
*                 *
*                 *
*                 *
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *

Logic

Top Row      -> i == 1
8th Row      -> i == n - 2
Bottom Row   -> i == n
Left Column  -> j == 1
Right Column -> j == n

Condition

i == 1 ||
i == n - 2 ||
i == n ||
j == 1 ||
j == n
*/