import java.util.Scanner;
class EvonNumber
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int digit=0;
		int even=0;
		
		while (num>0)
		{
			int last= num%10;
			digit++;
			if(last%2==0){
			even++;
			}
			
			num/=10;
		}
		
		if (even==digit)
		{
			System.out.println("Evon Number .");
		}
		else{
			System.out.println("It is not Evon Number .");
		}
		
		
		
		
		
	}
}
