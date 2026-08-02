import java.util.Scanner;
class  Pattern29
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		
		
		for (int i =0 ;i<n ;i++ )
		{
			for (int j=0 ;j<=i ;j++ )
			{
				System.out.print("1 ");
			}
			for (int j=i+1 ;j<n ;j++ )
			{
				System.out.print("0 ");
			}
			
			
			System.out.println();
		}
	}
}

/*
Pattern (n = 4)

1 0 0 0
1 1 0 0
1 1 1 0
1 1 1 1

Logic

First Loop (j <= i)
-> Print 1

Second Loop (j = i + 1 to n - 1)
-> Print 0

Condition

j <= i
    print(1);

j > i
    print(0);
*/