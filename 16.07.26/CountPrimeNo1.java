import java.util.*;
class  CountPrimeNo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = sc.nextInt();
		int count=0;
		int num1=num;
		double ans=0;
		
		while(num!=0)
		{
			int last=num%10;
			
			count++;
			
			num/=10;
		}
		
		System.out.println("Count ="+count);
		double sum=1;
		
		while (num1!=0)
		{
			int last=num1%10;
			
		sum=Math.pow(last,count);
		
		ans+=sum;
		num1/=10;
		 
			
		}
		
		System.out.println(ans);
		
	}
}