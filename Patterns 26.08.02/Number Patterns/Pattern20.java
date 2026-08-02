import java.util.Scanner;

class Pattern20 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		int num = 1;
		char ch = (char)('a'+n*n/2-1);
		
		for (int i=1; i<=n ; i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(j%2!=0){
					System.out.print(num+ " ");
					num=num+4;
				}
				else{
					System.out.print(ch+ " ");
					ch-=4;
				}
			}
			num-=7;
			ch+=7;
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1 h 5 d
2 g 6 c
3 f 7 b
4 e 8 a

Logic

Start:
num = 1
ch = 'a' + (n * n / 2) - 1

Odd Column  -> Print num.
               num += 4

Even Column -> Print ch.
               ch -= 4

After every row:
num -= 7
ch += 7

Condition

if (j % 2 != 0)
{
    print(num);
    num += 4;
}
else
{
    print(ch);
    ch -= 4;
}
*/