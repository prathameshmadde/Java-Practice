import java.util.Scanner;

public class LargestSmallest1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2=sc.nextInt();

        String ans =(num1>num2)?(num1+" is Largest & "+num2+" is Smallest"):
                                    (num2+" is Largest & "+num1+" is Smallest");

       System.out.println(ans);

        
    }
}
