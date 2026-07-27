import java.util.Scanner;

class DisariumNumber 
{	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int count =0;
		int temp = num;
		int num1=num;
		while(temp>0){
			temp/=10;
			count++;
		}
		
		int sum =0;
		while (num!=0)
		{
			int last = num%10;
			
			int product = 1;
			for (int j = 0 ;j<count ; j++ )
			{
				product = product * last;
			}
			num/=10;
			sum = sum + product ;
			count--;
			
		}
		
		if (sum == num1 )
		{
			System.out.println("It is Disarium Number ");
			
		}
		else
		{
		System.out.println("It is NOT Disarium Number ");
		}
		
	}
}
