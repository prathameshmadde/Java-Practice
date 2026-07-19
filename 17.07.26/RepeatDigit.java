import java.util.Scanner;

class  RepeatDigit
{	//Q . Find a digit how many times repeated in a Number ? 
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println("Enter a digit to check repatation : ");
		int digit = sc.nextInt();
		int count=0;
		
		while (num!=0)
		{
			int last = num%10;
			if(digit==last){
			count++;
			}
			num/=10;
		}
		
		System.out.println(digit+" Repeated "+count+" Times ");
	}
}
