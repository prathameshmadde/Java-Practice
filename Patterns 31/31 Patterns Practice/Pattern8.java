import java.util.Scanner;
class  Pattern8
	{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = sc.nextInt();
		char ch = (char)('a'+n*n/2-1);
		int num = 1;
		
		for (int i=1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ; j++)
				
			{
				if ((j)%2!=0)
				{
					System.out.print(num++ + " ");
					
				}
				else
				{
					System.out.print(ch-- + " ");
				}
			}
			
			System.out.println();
		}
	}
}

/*
1  h  2  g
3  f  4  e
5  d  6  c
7  b  8  a
*/