import java.util.Scanner;

class HighestCommonFactor  

{	//Q The HCF is the largest number that divides two or more numbers exactly (without leaving a remainder).
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number 2 : ");
		int num2 = sc.nextInt();
		int small = num1<num2 ? num1 : num2;
		
		while (small>=1)
		{
			if(num1%small==0 && num2%small==0){
			{System.out.println("Hcf no : " + small);
			break;
			}
			small --;
		}
	}
