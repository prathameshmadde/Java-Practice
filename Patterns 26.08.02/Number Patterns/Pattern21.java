import java.util.Scanner;
class  Pattern21
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num=n*n/2;
		char ch= 'a';
		
		for (int i=1 ;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(j%2!=0){
					System.out.print(num+ " ");
					num=num-4;
				}
				else{
					System.out.print(ch+ " ");
					ch+=4;
				}
				
			}
			num+=7;
			ch-=7;
			System.out.println();
		}
	}
}


/*
Pattern (n = 4)

8 a 4 e
7 b 3 f
6 c 2 g
5 d 1 h

Logic

Start:
num = n * n / 2
ch = 'a'

Odd Column  -> Print num.
               num -= 4

Even Column -> Print ch.
               ch += 4

After every row:
num += 7
ch -= 7

Condition

if (j % 2 != 0)
{
    print(num);
    num -= 4;
}
else
{
    print(ch);
    ch += 4;
}
*/