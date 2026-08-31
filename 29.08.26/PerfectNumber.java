class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        if (n == sumOfFactors(n)) {
            System.out.println("Perfect No.");
        } else {
            System.out.println("Not Perfect No.");
        }
    }
    public static int sumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}