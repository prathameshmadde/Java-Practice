import java.util.Scanner;
class LenghtofNum  
{
	public static void main(String[] args) 
	{	Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		System.out.println("Length of a NUmber : "+ length(num));
	}
	
	public static int length(int num){
		int count=0;
		for (int i = num ;i!=0 ;i/=10 )
		{
			count++;
		}
		return count;
	}
}

