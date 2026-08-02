import java.util.Scanner;
class Pattern14 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		char ch = 'a';
		int num	=1;
		
		for (int i = 1;i<=n ;i++ )
		{
			for (int j=1;j<=n ; j++)
			{
				if(i%2!=0){
					System.out.print(num++ + " ");
				
				}
				else
				{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}
}


/*
Pattern (n = 4)

1 2 3 4
a b c d
5 6 7 8
e f g h

Logic

Start:
num = 1
ch = 'a'

Odd Row  (i % 2 != 0)
-> Print numbers.
-> num++

Even Row (i % 2 == 0)
-> Print characters.
-> ch++

Condition

if (i % 2 != 0)
    print(num++);
else
    print(ch++);
*/