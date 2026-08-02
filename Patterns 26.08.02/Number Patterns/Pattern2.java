import java.util.Scanner;

class Pattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ;i++ )
        {
			for (int j=1;j<=n ;j++ )
			{
				if (i==1 || j==1 || i==n || j==n || i==j)
				{
					if(i==1 || i==n )
					{
						System.out.print(j + " ");
					}
					else if(j==1 || j==n)
					{
						System.out.print(j + " ");	
					}
					else if(i==j)
					{
						System.out.print(j + " ");	
					}	
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
Pattern (n = 5)

1 2 3 4 5
1 2     5
1   3   5
1     4 5
1 2 3 4 5

Logic

Top Row        -> i == 1 (Print j)
Bottom Row     -> i == n (Print j)
Left Column    -> j == 1 (Print j)
Right Column   -> j == n (Print j)
Main Diagonal  -> i == j (Print j)

Condition

i == 1 ||
i == n ||
j == 1 ||
j == n ||
i == j
*/