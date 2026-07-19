import java.util.Scanner;
class  Power2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NO : ");
		int num = sc.nextInt();
		
		System.out.println("Enter a Power : ");
		int power = sc.nextInt();
		int mul = 1;
		for(int i =1; i<=power; i++){
			mul = mul * num;
		}
		
		System.out.println(num+"^"+power+" = "+mul);
		
	}
}