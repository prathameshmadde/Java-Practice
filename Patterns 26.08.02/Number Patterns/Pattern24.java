import java.util.Scanner;
class  Pattern24
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
				
				System.out.print(ch++ + " ");
			}
			
			for (int j=i+1;j<=n ; j++)
			{
				System.out.print(num++ + " ");
			}
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

a 1 2 3
b c 4 5
d e f 6
g h i j

Logic

Start:
num = 1
ch = 'a'

First Loop (j <= i)
-> Print characters.
-> ch++

Second Loop (j = i+1 to n)
-> Print numbers.
-> num++

Condition

First Loop:
print(ch++);

Second Loop:
print(num++);
*/