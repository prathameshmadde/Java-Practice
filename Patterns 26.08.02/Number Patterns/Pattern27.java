import java.util.Scanner;
class  Pattern27
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of Rows : ");
		int n = sc.nextInt();
		System.out.println("ENter table no : ");
		int num = sc.nextInt();
		int a = 1;
		
		for (int i =1 ;i<=n ;i++ )
		{
			for (int j=1 ;j<=n ;j++ )
			{
				System.out.print(num*a + "  " );
				if(num*a<=10){System.out.print(" ");}
				a++;
			}
			
			
			System.out.println();
		}
	}
}


/*
Pattern (n = 4, Table = 2)

2  4  6  8
10 12 14 16
18 20 22 24
26 28 30 32

Logic

Start:
a = 1

Print:
num * a

After every print:
a++

Condition

No condition required.

print(num * a);
a++;
*/