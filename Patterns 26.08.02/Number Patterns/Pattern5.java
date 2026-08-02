import java.util.Scanner;

class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();
		int num = 1;
		for (int i=1; i<=n ;i++ )
		{
			for (int j=1 ;j<=n ;j++ )
			{
				if(i%2!=0){
					System.out.print(num++ + " ");
					if(num<=10) System.out.print(" ");
					}
				
				else{ 
					System.out.print(num-- + " ");
					if(num<9) System.out.print(" ");
					}		
					
			}
			if(i%2!=0) { num+=n-1; }
			
			else{ num+=n+1 ; }
			
			System.out.println();
		}
    }
}

/*
Pattern (n = 5)

1  2  3  4  5
10 9  8  7  6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

Logic

Odd Row  (i % 2 != 0) -> Print numbers in increasing order.
Even Row (i % 2 == 0) -> Print numbers in decreasing order.

After every odd row:
num += n - 1

After every even row:
num += n + 1

Condition

if (i % 2 != 0)
    print(num++);
else
    print(num--);
*/