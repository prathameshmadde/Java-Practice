class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 121;
		int sum =0;
		for (int i =num ; i>0 ; i/=10 )
		{
			int last = i% 10 ;
			sum = sum *10 + last ;
		}
		
		if (num == sum )
		{
			System.out.println("It is Palindrome " + num );
		}else{
			System.out.println("It is not Palindorme " + num );
		}
	}
}
