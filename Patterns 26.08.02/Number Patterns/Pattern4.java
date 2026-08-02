import java.util.Scanner;

class Pattern4
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
				System.out.print(num++ + " ");
				if(num<=10){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}

/*
Pattern (n = 5)

1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

Logic

Print a continuously increasing number.

num = 1

Print num
Increment num after every print.

Condition

No condition required.
Simply print num++.
*/