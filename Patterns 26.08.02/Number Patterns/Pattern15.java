import java.util.Scanner;
class Pattern15 
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
				if(j%2!=0){ 
					System.out.print(num + " ");
					num=num+4;
					}
				else{
					System.out.print(ch + " ");
					ch+=4;
				}	
				
			}
			ch=(char)('a'+i);
			num=1+i;
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1 a 5 e
2 b 6 f
3 c 7 g
4 d 8 h

Logic

Start:
num = 1
ch = 'a'

Odd Column  (j % 2 != 0)
-> Print number.
-> num += 4

Even Column (j % 2 == 0)
-> Print character.
-> ch += 4

After every row:
num = i + 1
ch = 'a' + i

Condition

if (j % 2 != 0)
{
    print(num);
    num += 4;
}
else
{
    print(ch);
    ch += 4;
}
*/