import java.util.Scanner;
class  Pattern23
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num = 1;
		char ch ='a';
		
		for (int i=1 ;i<=n ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(num++ + " ");
				
			}
			
			for (int j=i+1;j<=n ; j++)
			{
				System.out.print(ch++ + " ");
			}
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1 a b c
2 3 d e
4 5 6 f
7 8 9 10

Logic

Start:
num = 1
ch = 'a'

First Loop (j <= i)
-> Print numbers.
-> num++

Second Loop (j = i+1 to n)
-> Print characters.
-> ch++

Condition

First Loop:
print(num++);

Second Loop:
print(ch++);
*/