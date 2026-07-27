import java.util.Scanner;

class  CoPrimeNumbers
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number 2: " );
		int num2 = sc.nextInt();
		int small = num1<num2 ? num1:num2;
		
		
		for (    ; small>0   ;small--)
		{
			if(num1%small==0 && num2%small==0){
				break;
			}
		}
		
		if(small == 1){
			System.out.println("It is Co-Prime No .");
		}
		else{
			System.out.println("It is Not a Co-Prime No .");	
		}
	}
}
