import java.util.Scanner;
class  EvenOdd
{//Q Check whether a number is Even or Odd.
	
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println(num + " is Even .");
		}
		else
		{ System.out.println(num+ " is Odd ."); 
			}
		
	}
}
