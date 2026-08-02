import java.util.Scanner;

class Pattern16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i =0 ; i<=n ;i++ )
        {
			for (int j=-2 ;j<=n+2 ;j++ )
			{
				if(i==0 || i==n || j==-2 || j==0 || j==n || j==n+2 || i+j==n ){
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

* * * * * * * * * * * * * * *
*   *                 * *   *
*   *               *   *   *
*   *             *     *   *
*   *           *       *   *
*   *         *         *   *
*   *       *           *   *
*   *     *             *   *
*   *   *               *   *
*   * *                 *   *
* * * * * * * * * * * * * * *

Logic

Top Row          -> i == 0
Bottom Row       -> i == n
1st Left Column  -> j == -2
2nd Left Column  -> j == 0
1st Right Column -> j == n
2nd Right Column -> j == n + 2
Anti Diagonal    -> i + j == n

Condition

i == 0 ||
i == n ||
j == -2 ||
j == 0 ||
j == n ||
j == n + 2 ||
i + j == n
*/