import java.util.Scanner;

class  SpyNumber

{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		
		while(num!=0){
			int last=num%10;
			sum=sum + last ;
			product= product * last;
			num/=10;
		}
		
		if(sum==product){
			System.out.println("It is Spy Number");
		}
		else{
			System.out.println("It is not Spy Number");
		}
		
			
	}
}
