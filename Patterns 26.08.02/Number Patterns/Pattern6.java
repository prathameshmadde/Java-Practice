	import java.util.Scanner;

	class Pattern6
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of Rows : ");
			int n = sc.nextInt();
			int num = n;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=n ;j++ )
				{
					if (i%2!=0)
					{
						System.out.print(num-- + " ");
						if(num<10) System.out.print(" ");
					}
					else
					{
						System.out.print(num++ + " ");
						if(num<=10) System.out.print(" ");
					}
					
				}
				if(i%2!=0){ num+=n+1; }
				else { num+=n-1; }
				System.out.println();
			}
		}
	}
	
	/*
Pattern (n = 5)

5  4  3  2  1
6  7  8  9  10
15 14 13 12 11
16 17 18 19 20
25 24 23 22 21

Logic

Start:
num = n

Odd Row  (i % 2 != 0) -> Print numbers in decreasing order.
Even Row (i % 2 == 0) -> Print numbers in increasing order.

After every odd row:
num += n + 1

After every even row:
num += n - 1

Condition

if (i % 2 != 0)
    print(num--);
else
    print(num++);
*/