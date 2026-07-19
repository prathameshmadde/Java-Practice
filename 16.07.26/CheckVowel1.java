import java.util.Scanner;
class  CheckVowel1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter =");
		char ch = sc.next().charAt(0);
		
		if (ch>='a' && ch <='z' || ch>='A'&&ch<='Z')
		{
			switch (ch)
		{
		case 'a','e','i','o','u','A','E','I','O','U':
			{
				System.out.println("It is Vowel");
			}break;
		
		default:
			System.out.println("It is consonant ");
		}
		
		}
		else{
			System.out.println("It is not charecter ");
		}
		
		
	}
}
