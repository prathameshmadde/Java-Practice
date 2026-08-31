class HarshadNumber {
    public static void main(String[] args) {
        int n = 9;
        if (n % sumOf(n) == 0) {
            System.out.println("Harshad");
        } else {
            System.out.println("Not Harshad");
        }
    }
    public static int sumOf(int n) {
        int sum = 0;

        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }

        return sum;
    }
}