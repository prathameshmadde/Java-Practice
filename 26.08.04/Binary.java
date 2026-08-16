class Binary 
{
	public static void main(String[] args) 
	{ int num1 = 120 ;
		String bin = "";
		
		while (num1!=0)
		{
			int rem = num1%2;
			bin = rem+ bin ;
			num1/=2;
		}
		System.out.println(bin);
		
		int num2=0;
		for (int i=bin.length()-1 ,j=0;i>=0;i--;j++ )
		{
			int dgt = bin.charAt(i)-'0';
			int power = powerNum(2,j);
			int prd =dgt*power ;
			num2+=prd;
		}
		public statc int powerNum(int num, int pow){
			if(pow==0) return 1;
			int op =1;
			for(int i=1;i<=pow;i++){
				op*=num;
			}
			return op;
		}
		
		
		System.out.prinitln(num2);
	
	}
}
