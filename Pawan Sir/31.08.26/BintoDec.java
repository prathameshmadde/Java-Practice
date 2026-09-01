import java.util.Scanner;
class  BintoDec
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no =");
		int num = sc.nextInt();
		int lastdigit = 0;
		int place =1;
		int binary =0;
		
		for (int i=num ;i>0 ;i/=10 )
		{
			lastdigit = i%10;
			binary = binary + (lastdigit*place);
			place = place * 2;
		
		}
		System.out.println(binary);
		
		
	}
}