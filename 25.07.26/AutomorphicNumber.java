import java.util.Scanner;

class AutomorphicNumber 
{	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int count =0;
		int temp = num;
		
		while(temp>0){
			temp/=10;
			count++;
		}
		
		int square=num*num;
		int sum =1;
		for (int i = 1;i<=count ; i++ )
		{
			
			sum = sum * 10 ;
		}
		
		if(square % sum == num){
			System.out.println("It is Automorphic Number ");
		}
		else
		{
			
			System.out.println("It is Not Automorphic Number ");
		}
		
	}
}
