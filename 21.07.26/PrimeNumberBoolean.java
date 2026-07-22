import java.util.Scanner;

class  PrimeNumberBoolean

{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		boolean flag = true;
		
		if(num<=1){
			flag = false;
			}
		
		else
		{
			for (int i =2 ; i <=num/2 ; i++ )
			{
				if(num%i==0){
					flag=false;
					break;
					}
			}
		
		}
		
		
		if(flag){
			System.out.println(num+" is Prime Number .");
		}
		else
		{
			System.out.println(num+" is Not Prime Number ."); 
			}
		
	}
}
