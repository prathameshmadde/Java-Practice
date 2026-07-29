import java.util.Scanner;

class  NextPrime
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int next = 0;
		boolean flag = false;
		while (	true )
		{
			num++;
			if(isPrime(num)){
				next=num;
				flag=true;
				break;
			}
		}
		
		if(flag){
			System.out.println(next);
		}
			
		
	}
	
	
	public static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
