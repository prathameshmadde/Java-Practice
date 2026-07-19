import java.util.Scanner;
class  SumofDigit1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		
		int i=0;
		
		int count=0;
		int mul=1;
		while(num!=0)
		{
			int last=num%10;
			count+=last;
			mul*=last;
			num/=10;
		}
		if(count==mul){
		System.out.println("SUM OF DIGIT AND MULTIPLICATION IS SAME");
		}
		else{
		System.out.println("SUM OF DIGIT AND MULTIPLICATION IS NOT SAME");
		}
		
		
		
	}
}