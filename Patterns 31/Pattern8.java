import java.util.Scanner;

class  Pattern8{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = sc.nextInt();
		char a =(char)('a'+(n*n/2));
		int num=1;
		
		
		for (int i=1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ; j++)
				
			{
				if(j%2!=0){System.out.print(num++ + " ");}
				
				else{System.out.print(a-- + " ");}
				
				if(num<=10)System.out.print(" ");
			}
			System.out.println();
		}
	}
}

// not done 