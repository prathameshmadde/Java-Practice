import java.util.Scanner;

class PatternZ1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i=-1 ;i<n+1 ;i++ )
        {
			for (int j=0 ; j<n ;j++ )
			{
				if (i==-1 || i==0 || i==n-1 || i==n || j==0 || j==n-1 || i+j==n-1)
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