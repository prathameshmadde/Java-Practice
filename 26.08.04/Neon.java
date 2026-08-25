class  Neon
{
	public static void main(String[] args) 
	{	int num = 9 ;
		int square = num*num;
		int sum = 0;
		
		for(int i = square ; i >0 ; i/=10){
			int last = i% 10 ;
			sum = sum + last ;
			
		}
		if (num == sum)
		{
			System.out.println("It is Neon no ");
		}else{
			System.out.println("It is not Neon no ");
		}
	}
}
