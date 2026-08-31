import java.util.Scanner;
class HappyNumber {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {

        if (n == 1)
            return true;

        else if (n == 4)
            return false;

        else {
            while (n != 4 && n != 1) {
                n = sumOfDigit(n);
            }

            return n == 1;
        }
    }
    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int last = n % 10;

            sum += last * last;

            n /= 10;
        }

        return sum;
    }
}