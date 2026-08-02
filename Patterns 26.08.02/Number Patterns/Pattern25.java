import java.util.Scanner;
class  Pattern25
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num = 1;
		char ch ='a';
		
		for (int i=1 ;i<=n ;i++ )
		{
			for (int j=1;j<=n+1-i ;j++ )
			{
				System.out.print(num++ + " ");
				if(num<=10){System.out.print(" "); }
				
			}
			
			for (int j=1+n+1-i ;j<=n ; j++)
			{
				System.out.print(ch++ + "  ");
			}
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1  2  3  4
5  6  7  a
8  9  b  c
10 d  e  f

Logic

Start:
num = 1
ch = 'a'

First Loop (j <= n + 1 - i)
-> Print numbers.
-> num++

Second Loop (remaining columns)
-> Print characters.
-> ch++

Condition

First Loop:
print(num++);

Second Loop:
print(ch++);
*/