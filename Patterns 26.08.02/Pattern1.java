import java.util.Scanner;

class Pattern1 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter NO of Rows : ");
		int n = sc.nextInt();
		
		for (int i=1 ; i<=n ;i++ )
		{
			for (int j =1; j<=n ;j++ )
			{
				if(i==1 || j==1 || i==n || j==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			System.out.println("");
		}
	}
}


/*
        Pattern (n = 4)

        * * * *
        *     *
        *     *
        * * * *

        Coordinates

             j=1 j=2 j=3 j=4
        i=1   *   *   *   *   -> Top Row
        i=2   *           *   -> Left & Right Column
        i=3   *           *   -> Left & Right Column
        i=4   *   *   *   *   -> Bottom Row

        Logic
        -----
        i == 1   -> Top Row
        i == n   -> Bottom Row
        j == 1   -> Left Column
        j == n   -> Right Column
*/
