class  Pattern2
{
	public static void main(String[] args) 
	{	
		
		int n = 3;
		int num = 2;
		
		for (int i=1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ; j++)
			{
				System.out.print(num + " ");
				num+=2;
				if(num<=10) System.out.print(" ");
			}
			System.out.println();
		}
	}
}