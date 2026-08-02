import java.util.Scanner;
class Pattern16 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num=1;
		char ch = 'a';
		
		for (int i =1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(j%2!=0){
					System.out.print(num++ + " ");
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

1 a 2 b
3 c 4 d
5 e 6 f
7 g 8 h

Logic

Start:
num = 1
ch = 'a'

Odd Column  (j % 2 != 0)
-> Print number.
-> num++

Even Column (j % 2 == 0)
-> Print character.
-> ch++

Condition

if (j % 2 != 0)
    print(num++);
else
    print(ch++);
*/