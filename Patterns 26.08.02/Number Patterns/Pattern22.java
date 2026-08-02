import java.util.Scanner;
class  Pattern22
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		int num = 1;
		
		for (int i=1 ;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(num+ " ");
				if(num<10){	
					System.out.print(" "); }
				num+=2;
				
			}
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1  3  5  7
9  11 13 15
17 19 21 23
25 27 29 31

Logic

Start:
num = 1

Print num.

After every print:
num += 2

Condition

No condition required.

print(num);
num += 2;
*/