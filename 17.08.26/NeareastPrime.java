import java.util.Scanner;
class NeareastPrime  
{
	public static void main(String[] args) 
	{	Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		System.out.println("Nearest Prime NO : "+ nextPrime(num));
	}
	
	public static int nextPrime(int num){
		int count=1;
		for (int i =1 ; ;i++ )
		{
			if(isPrime(num-i)){
				return num-i;
			}
			
			if(isPrime(num+i)){
				return num+i;
			}
		}	
	}
	
	public static boolean isPrime (int num){
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
}
