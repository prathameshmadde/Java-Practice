import java.util.Scanner;

class Pattern9
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		
		for (int i =1 ; i<=n ; i++ )
		{
			for (int j=1; j<=n ; j++ )
			{
				if( i==1 || j==1 || i==n  || i==j || i+j==n+1 ){
					System.out.print("* ");
				}
				else{
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
* *             *
*   *         *
*     *     *
*       * *
*       * *
*     *     *
*   *         *
* *             *
* * * * * * * * * *

Logic

Top Row         -> i == 1
Bottom Row      -> i == n
Left Column     -> j == 1
Main Diagonal   -> i == j
Anti Diagonal   -> i + j == n + 1

Condition

i == 1 ||
i == n ||
j == 1 ||
i == j ||
i + j == n + 1
*/