import java.util.Scanner;

class  SunnyNumber
{	//Q A Sunny Number is a number whose next number (n + 1) is a perfect square.
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt(); 
		
		int num1=num+1;
		
		for(int i =0; i< num ; i++){
			if(i*i == num1){
				System.out.println("Sunny number "+num1);
				return;
			}
		}
		
		System.out.println("It is not Sunny Number .");
		
		
		
	}
}
