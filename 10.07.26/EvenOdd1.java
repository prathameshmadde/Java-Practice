import java.util.Scanner;

public class EvenOdd1 {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number : ");

        int num=sc.nextInt();
        String ans = (num%2==0)?(num+" is Even Number"):(num+" is Odd Number ");
        System.out.println(ans);
    }
}
