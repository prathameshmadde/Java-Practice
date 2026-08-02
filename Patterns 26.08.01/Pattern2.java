import java.util.Scanner;

class  Pattern2 {
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter no of Rows ");
		int n = sc.nextInt();
		
		
		for (int i=1 ; i<=n ; i++ )
			{
			
			for (int j=1 ; j<=n ; j++)
			{	int a =i;
				
				if ( i==1 || j ==1 || i == n || j==n  )
				{
					System.out.print(a + " ");
				}
				else{
					System.out.print("  ");
				}
					
			}
			
			System.out.println();
		}
	}
}
