import java.util.Scanner;

class Pattern17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i=-2 ;i<=n+2 ;i++ )
        {
			for (int j=0 ; j<=n ;j++ )
			{
				if (i==-2 || i==0 || i==n || i==n+2 || j==0 || j==n || i+j==n)
				{
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

* * * * * * * * * * * 
*                   * 
* * * * * * * * * * * 
*                 * * 
*               *   * 
*             *     * 
*           *       * 
*         *         * 
*       *           * 
*     *             * 
*   *               * 
* *                 * 
* * * * * * * * * * * 
*                   * 
* * * * * * * * * * * 

Logic

Top Row          -> i == -2
2nd Top Row      -> i == 0
Bottom Row       -> i == n
2nd Bottom Row   -> i == n + 2
Left Column      -> j == 0
Right Column     -> j == n
Anti Diagonal    -> i + j == n

Condition

i == -2 ||
i == 0 ||
i == n ||
i == n + 2 ||
j == 0 ||
j == n ||
i + j == n
*/