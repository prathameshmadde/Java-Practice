import java.util.Scanner;

public class PositiveNegative1 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number : ");

        int num=sc.nextInt();
        
        String ans = (num>0)?(num+" is Positive Number "):(num+" is Negative Number ");
        System.out.println(ans);
    }
}
