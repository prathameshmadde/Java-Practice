import java.util.Scanner;

class  Pattern9
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter NO of Rows : ");
		int n= sc.nextInt();
		int num = 1; 
		char ch = 'a';
	
		for (int i = 1 ; i<=n ; i++ )
		{
			for (int j= 1; j<=n ;j++ )
			{
				if(i%2!=0) 
				{
					System.out.print(num++ + " ");
					if (num<=10)
					{System.out.print(" ");
					}
				}
				
				else
				{ 
						System.out.print(ch++ + "  ");
				}	
					
			}
			
			System.out.println();
		}
		
		}
}


/*
1  2  3  4  5
a  b  c  d  e
6  7  8  9  10
f  g  h  i  j
11 12 13 14 15
*/