import java.util.Scanner;

class  Xylem

{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sumofend=0;
		int sumofmid=0;
		
		sumofend=num%10;
		num/=10;
		
		while(num>9){
			int last =num%10;
			sumofmid = sumofmid + last ;
			num/=10;
		}
		sumofend+=num;
		
		if(sumofend == sumofmid){
			System.out.println("It is Xylem.");
			
		}
		else{
			System.out.println("It is not Xylem.");
		}
		
			
	}
}
