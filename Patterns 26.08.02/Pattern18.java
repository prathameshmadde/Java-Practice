import java.util.Scanner;

class Pattern18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i=0 ; i<=n ; i++ )
        {
			for (int j=-2 ; j<= n+2 ; j++ )
			{
				if (i==0 || i==n || j==-2 || j==0 || j==n || j==n+2 || i==j)
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

