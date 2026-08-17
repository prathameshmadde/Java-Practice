import java.util.Scanner;

class TwistedPrime 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner (System.in);
		System.out.println("ENter a Number : ");
		int num = sc.nextInt();
		
			
		if(isPrime(num) && isPrime(reversNum(num))){
			System.out.println("It is Twisted Prime .");
		}
		else {
			System.out.println("It is not Twisted Prime .");
		}
				
	}
	
	public static boolean isPrime(int num ){
		if(num<=1){return false ;}
		
		else{
			for(int i = 2 ; i<= num / 2 ; i++){
				if(num%i==0){
					return false;
				}
			}
			
			return true;
		}
	}
	
	public static int reversNum(int number){
		int sum =0;
		for (int i = number ; i !=0 ; i/=10 )
		{
			int last = i%10;
			sum = sum *10 + last ;
			
		}
		return sum;
	}
	
	
}
