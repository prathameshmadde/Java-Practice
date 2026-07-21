import java.util.Scanner;

class  Armstrong 

{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int count=0;
		int ans =0;
		int temp = num;
		
		while (num>0)
		{
			
			count++;
			num/=10;
		}
		
		for (int i =temp ; i>0 ; i/=10 )
		{int product=1 ;
			int last = i % 10;
			
			for (int j =1; j<=count ; j++)
			{
				product = product *last;
			}
		ans = ans + product ;	
		}
		
		
		if (ans == temp)
		{
			System.out.println("It is Armstorng Number .");
		}
		else
		{
			System.out.println("It is Not Armstrong Number .");
		}
			
	}
}
