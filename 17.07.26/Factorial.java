import java.util.Scanner;
class  Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NO : ");
		int num = sc.nextInt();
		int num1 = num;
		int mul=1;
		while (num>1)
		{
			mul = mul * num;
			num--;
		}
		
		System.out.println("Factorial of a "+num1+" = "+mul);
		
	}
}
