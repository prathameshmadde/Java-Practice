import java.util.Scanner;
class MinMax
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int i;
		for (i=1;i*(i+1)<=num ;i++ )
		{
			if (i*(i+1)==num)
			{
				System.out.println("Pronic No .");
				break;
			}
		
		}
		if(i*(i+1)>num){
		System.out.println("It is not Pronic No .");
		}
		
		
	}
}
