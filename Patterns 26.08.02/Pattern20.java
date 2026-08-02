import java.util.Scanner;

class Pattern20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();
		
		for (int i= 0 ;i<n ;i++ )
		{
			for (int j= 0 ; j<n ; j++ )
			{
				if(i==0 || j==0 || i==n-1 || j==n-1 || i==n/2)
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
* * * * * * * * * * 
*                 * 
*                 * 
*                 * 
* * * * * * * * * * 

Logic

Top Row        -> i == 0
Middle Row     -> i == n / 2
Bottom Row     -> i == n - 1
Left Column    -> j == 0
Right Column   -> j == n - 1

Condition

i == 0 ||
i == n / 2 ||
i == n - 1 ||
j == 0 ||
j == n - 1
*/