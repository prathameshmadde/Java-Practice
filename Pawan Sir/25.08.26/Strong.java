class  Storng
{
	public static void main(String[] args) 
	{	int num = 1451 ;
		int sum =0;
		
		for (int i =num ; i>0 ; i/=10 )
		{	int product =1;
			int last = i%10;
			for (int j =1 ;j<=last ; j++ )
			{
				product = product * j;
			}
			sum = sum + product ;
		}
		
		if (num == sum )
		{
			System.out.println(sum +" is Strong NUmber ");
		}
		else{
			System.out.println(num +" is not Strong Number ");
		}
		
	}
}
