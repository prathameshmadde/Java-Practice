import java.util.Scanner;

class Pattern9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();
		int num=n;
        for (int i=1 ; i<=n ;i++ )
        {
			for (int j=1 ;j<=n ;j++ )
			{
				System.out.print(num-- + " ");
				if(num<9){ System.out.print(" "); }
				
			}
			num+=n+n;
			System.out.println();
        }
    }
}

/*
Pattern (n = 4)

4  3  2  1  
8  7  6  5  
12 11 10 9  
16 15 14 13 

Logic

Start:
num = n

Print numbers in decreasing order.

After every print:
num--

After every row:
num += 2 * n

Condition

No condition required.

print(num--);
*/