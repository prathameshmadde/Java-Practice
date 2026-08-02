class Pattern11Name 
{
	public static void main(String[] args) 
	{
		int n = 9;
		
		//p
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( j==0 || i==0 || j==n-1 && i<n/2 || i==n/2)
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//R
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( j==0 || i==0 || j==n-1 && i<n/2 || i==n/2 || i==j && i>n/2  )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//A
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( i+j==n/2  || j==0 && i>n/2 || i==n/2 || j==n-1&& i>n/2 || j-i == n/2   ) //imp important last condition 
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		//T
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( i==0 || j==n/2  )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//H
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( j==0 || j==n-1 || i==n/2  )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//A
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( i+j==n/2  || j==0 && i>n/2 || i==n/2 || j==n-1&& i>n/2 || j-i == n/2   ) //imp important last condition 
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//M
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( j==0 || j==n-1 || i==j && i<n/2 || i+j==n-1 && i<=n/2 )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//E
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( j==0 || i==0 || i==n/2  || i==n-1  )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		//S
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( i==0  || j==0 && i<n/2 || i==n/2 || j==n-1 && i>n/2 || i==n-1  )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		//H
		
		for (int i =0 ; i<n ; i++ )
		{
			for (int j = 0; j< n ; j++ )
			{
				if ( j==0 || i==n/2 || j==n-1   )
				{				
					System.out.print("*"+" ");
				}
				else
				{				
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
