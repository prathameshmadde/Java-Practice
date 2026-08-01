import java.util.Scanner;

class  Pattern10{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = sc.nextInt();
		
		int num=1;
		
		
		for (int i=1 ; i<=n ; i++ )
		{	int a=i;
			for (int j=1 ; j<=n ; j++)
				
			{
				System.out.print(a + " ");
				if(num<10)System.out.print(" ");
				a+=3;
				
				
			}
			System.out.println();
		}
	}
}


/*
Enter no of rows :
3
1 4 7
2 5 8
3 6 9
*/