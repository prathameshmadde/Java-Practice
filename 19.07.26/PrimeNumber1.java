import java.util.Scanner;
class	PrimeNumber1
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		boolean ans = true;
		
		while (num>0)
		{
			int last= num%10;
			
			if(last<=1){
				ans=false;
				break;
			}
			else
			{
				if(last!=2&&last!=3&&last!=5&&last!=7)
				{ans=false;
				break;}
				
				else if (last==2&&last==3&&last==5&&last==7) {
					ans=true;
				break;}
				
				/*for(int i=2;i<last;i++){
				
				if (last%i==0)
				{
					ans=false;
					break;
				}*/
			}
			
			num/=10;}
		
		
		if (ans)
		{
			System.out.println("All digits are Prime Number .");
		}
		else{
			System.out.println("All digits are not Prime Number .");
		}
		
		
		
		
		
	}
}