import java.util.Scanner;

class Pattern10 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int n = sc.nextInt();
		
		for (int i=n ;i>=1 ;i-- )
		{
			int num =i;
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(num + " ");
				if(num<10) { System.out.print(" "); }
				num+=4;
			}
			System.out.println();
		}
	}
}


/*
Pattern (n = 4)

4  8  12 16
3  7  11 15
2  6  10 14
1  5  9  13

Logic

Outer Loop:
Start from i = n and decrement to 1.

For each row:
num = i

Print num.
After every column:
num += n

Condition

No condition required.

num = i;
print(num);
num += n;
*/