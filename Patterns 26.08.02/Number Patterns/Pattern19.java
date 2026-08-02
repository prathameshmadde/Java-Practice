import java.util.Scanner;

class Pattern19 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		int num = n*n/2;
		char ch ='a';
		
		for (int i=1 ;i<=n ;i++ )
		{
			for (int j=1 ;j<=n ;j++ )
			{
				if(i%2!=0){
				System.out.print(num-- + " ");
				}
				else{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

8 7 6 5
a b c d
4 3 2 1
e f g h

Logic

Start:
num = n * n / 2
ch = 'a'

Odd Row  -> Print numbers.
            num--

Even Row -> Print characters.
            ch++

Condition

if (i % 2 != 0)
    print(num--);
else
    print(ch++);
*/