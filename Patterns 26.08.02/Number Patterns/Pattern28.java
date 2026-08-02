import java.util.Scanner;
class  Pattern27
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		
		
		for (int i =1 ;i<=n ;i++ )
		{
			for (int j=1 ;j<=n ;j++ )
			{
				if ((i+j)%2!=0)
				{
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0

Logic

If (i + j) is Odd
-> Print 1

If (i + j) is Even
-> Print 0

Condition

if ((i + j) % 2 != 0)
    print(1);
else
    print(0);
*/