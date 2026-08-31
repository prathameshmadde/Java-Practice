class Neon {
    public static void main(String[] args) {
        int n = 9;
        if (n == sumOf(n * n)) {
            System.out.println("Neon");
        } else {
            System.out.println("Not Neon");
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
}