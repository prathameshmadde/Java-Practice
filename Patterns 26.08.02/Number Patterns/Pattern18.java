import java.util.Scanner;
class Pattern17 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num=1;
		char ch = (char)('a'+n*n/2-1);
		
		for (int i =1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(i%2!=0){
					System.out.print(num++ + " ");
					if(num<9){ System.out.print(" "); }
				}
				else{
					System.out.print(ch-- + "  ");
				}
			}
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1  2  3  4
h  g  f  e
5  6  7  8
d  c  b  a

Logic

Start:
num = 1
ch = 'a' + (n * n / 2) - 1

Odd Row  -> Print numbers.
            num++

Even Row -> Print characters.
            ch--

Condition

if (i % 2 != 0)
    print(num++);
else
    print(ch--);
*/