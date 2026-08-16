class PalindromePattern 
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i=1;i<=n ;i++ )
		{	int  num=1;
			for (int j =1; j<=n-i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1; j<=2*i-1 ; j++ )
			{
				if(j<i){
					System.out.print(num++ + " ");
				}
				else{
					System.out.print(num-- + " ");
				}
			}
			
			System.out.println();
		}
	}
}
