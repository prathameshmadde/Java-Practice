class Automorphic {
    public static void main(String[] args) {
        int n = 25; 
        int square = n * n;
        int divisor = divisorOf(n);

        if (square % divisor == n) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not automorphic");
        }
    }
    public static int divisorOf(int n) {
        int den = 1;
        for (int i = n; i > 0; i /= 10) {
            den *= 10;
        }
        return den;
    }
}
