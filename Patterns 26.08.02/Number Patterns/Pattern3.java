import java.util.Scanner;

class Pattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i =1 ; i<=n ; i++ )
        {
			for (int j=1 ;j<=n ; j++ )
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
    }
}

/*
Pattern (n = 5)

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

Logic

Print column number (j) at every position.

Condition

No condition required.
Simply print j.
*/