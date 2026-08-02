import java.util.Scanner;
class  Pattern26
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		int num = 1;
		char ch = 'a';
		
		for (int i =1 ;i<=n ;i++ )
		{
			for (int j=1 ;j<=n-i+1 ;j++ )
			{
				System.out.print(ch++ + "  " );
			}
			for (int j=1+n-i+1 ;j<=n ;j++ )
			{
				System.out.print(num++ + " ");
				if(num<=10){System.out.print(" ");}
			}
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

a  b  c  d
e  f  g  1
h  i  2  3
j  4  5  6

Logic

Start:
num = 1
ch = 'a'

First Loop (j <= n - i + 1)
-> Print characters.
-> ch++

Second Loop (remaining columns)
-> Print numbers.
-> num++

Condition

First Loop:
print(ch++);

Second Loop:
print(num++);
*/
