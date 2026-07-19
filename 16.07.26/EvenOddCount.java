import java.util.Scanner;
class  EvenOddCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		
		int i=0;
		int even=0;
		int odd=0;
		while(num!=0)
		{
			int last=num%10;
			
			if (last%2==0)
			{
				even++;
			}
			else{
				odd++;
			}
			num/=10;
		}
		
		System.out.println("EVEN NO OF DIGIT : "+even);
		System.out.println("ODD NO OF DIGIT:"+odd);
		
	}
}
