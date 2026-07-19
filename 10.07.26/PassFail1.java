import java.util.Scanner;

public class PassFail1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks : ");
        int marks=sc.nextInt();

        String ans = (marks>=35)?("You are Pass "):("You are Fail ");

        System.out.println(ans);
                                
        
    }
}
