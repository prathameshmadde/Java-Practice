class SpyNumber {
    public static void main(String[] args) {
        int n = 145;
        if (sumOf(n) == productOf(n)) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy No.");
        }
    }
    public static int sumOf(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int productOf(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }
}