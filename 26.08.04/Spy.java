class Spy 
{
	public static void main(String[] args) 
	{	int num =123;
		int product = 1; 
		int sum = 0;
		
		for (int i = num ;i>0 ;i/=10 )
		{
			int last = i% 10; 
			sum = sum + last ;
			product = product * last; 
		}
		
		if (sum == product )
		{
			System.out.println("It is Spy Number ");
		}else{
			System.out.println("It is not Spy Number ");
		}
	}
}
