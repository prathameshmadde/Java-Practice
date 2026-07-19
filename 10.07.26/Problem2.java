import java.util.Scanner;

public class Problem2 {
    public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch = sc.next().charAt(0);

        String ans = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U' )?(ch+" is vowel ."):
        (ch+" is Consonant");

        System.out.println(ans);
       
}
}
}
