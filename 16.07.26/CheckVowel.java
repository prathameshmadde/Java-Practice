import java.util.Scanner;
class  CheckVowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter =");
		char ch = sc.next().charAt(0);
		
		
		switch (ch)
		{
		case 'a','e','i','o','u','A','I','O','U':
			{
				System.out.println("It is Vowel");
			}break;
			
		case '1','2' ,'3', '4' , '5' ,'6' , '7' ,'8' ,'9' , '0':
			{
				System.out.println("It is not charecter ");
			}break;
		
		default:
			System.out.println("It is consonant ");
		}
		
		
	}
}
