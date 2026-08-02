import java.util.Scanner;
class  Pattern31
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		
		
		for (int i =1 ;i<=n ;i++ )
		{
			for (int j=1;j<=n-i ;j++ )
			{
				System.out.print("0 ");
			
			}
			for (int j=n-i+1 ; j<=n; j++ )
			{
				System.out.print("1 ");
			}
			
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

0 0 0 1
0 0 1 1
0 1 1 1
1 1 1 1

Logic

First Loop (j <= n - i)
-> Print 0

Second Loop (j = n - i + 1 to n)
-> Print 1

Condition

j <= n - i
    print(0);

j > n - i
    print(1);
*/