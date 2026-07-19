import java.util.Scanner;

class  PrintFactor
{	//Q. Print Factor of a Number 
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num= sc.nextInt();
		int div=1;
		while(div<=num/2){
		if(num%div==0){
			System.out.println(div);
		}
		div++;
		}
	}
}
