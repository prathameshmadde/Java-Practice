import java.util.Scanner;

class PrimeRange 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Start  : ");
		int start = sc.nextInt();
		System.out.println("Enter a End : ");
		int end = sc.nextInt();
		
		for (int i = start ; i< =end  ;i++ )
		{
			if(isPrime(i)){
				System.out.println(i);
			}
			
		}
	}
	
	public static boolean isPrime(int num ){
		
		if(num<=1){
			return false;
		}
		else
		{
			for (int j=2; j<=i/2 ;j++ )
			{
				if(num%j==0){
				return false;	
				
				}
			}
		}
		
		return true;
			
	}
}
