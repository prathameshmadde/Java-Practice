import java.util.Scanner;

class  Pattern11{
	public static void main(String[] args) 
	{	
		int n = 5;
		int a = n*2-1;
		int b=1;
		
		
		for (int i=1 ; i<=n ; i++ )
		{	int k=i;
			for (int j=1 ; j<=n ; j++)
				
			{
				System.out.print(k+" ");
				if(k<10)System.out.print(" ");
				k= j%2!=0 ? k+a : k+b;
			}
			
			System.out.println();
		}
	}
}

/*
1  10 11 20 21
2  11 12 21 22
3  12 13 22 23
4  13 14 23 24
5  14 15 24 25
*/
