import java.util.Scanner;

class Pattern8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows : ");
        int n = sc.nextInt();

        for (int i=1; i<=n ; i++)
        {int a= i;
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(a+ " ");
				if(a<10) System.out.print(" ");
				a=a+n;
			}
			System.out.println();
        }
    }
}

/*
Pattern (n = 5)

1  6  11 16 21
2  7  12 17 22
3  8  13 18 23
4  9  14 19 24
5  10 15 20 25

Logic

Start:
a = i

Print a
After every column:
a = a + n

Condition

No condition required.

a = i
print(a)
a += n
*/