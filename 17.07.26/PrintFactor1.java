import java.util.Scanner;

class  PrintFactor1
{	//Q. Print Factor of a Number using do while 
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num= sc.nextInt();
		int div=1;
		
		do
		{
			if(num%div==0){
			System.out.println(div);
		}
		div++;
		}
		while (div<=num/2);
	}
}
