import java.util.Scanner;

class  RepeatDigit1
{	//Q . Find a digit how many times repeated in a Number ? 
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println("Enter a digit to check repatation : ");
		int digit = sc.nextInt();
		int count=0;
		
		for (int i = num; i!=0; i/=10)
		{ int last = i%10;
			if(last==digit){
				count++;
			}
		}
		
		
		System.out.println(digit+" Repeated "+count+" Times ");
	}
}