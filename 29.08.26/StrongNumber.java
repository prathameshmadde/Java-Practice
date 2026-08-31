class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        if (n == sumOfDigit(n))
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }
    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return sum;
    }
    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}