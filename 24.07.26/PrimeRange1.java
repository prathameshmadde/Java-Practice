import java.util.Scanner;

class PrimeRange1 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Start  : ");
		int start = sc.nextInt();
		System.out.println("Enter a End : ");
		int end = sc.nextInt();
		
		for (int i = start ; i<=end  ;i++ )
		{
			
			
			if(i>1){
			
		
			for (int j=2; j<=i/2 ;j++ )
			{
				if(i%j==0){
				break;
				
				}
			}
		
		
		System.out.println(i);
			
		}
		
		}
	}
	
	
}
