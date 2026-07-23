import java.util.Scanner;

class SwitchWithoutVariable 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number 1 : ");
		int num1 = sc.nextInt(); //10
		System.out.println("Enter a Number 1 : ");
		int num2 = sc.nextInt(); //10 
		
		num1 = num1 + num2; // 10+20=30
		num2 = num1 - num2; // 30-20=10
		num1 = num1 - num2; // 30-10=20
		
		System.out.println("Number 1 : "+ num1);
		System.out.println("Number 2 : "+ num2);
		
	}
}
