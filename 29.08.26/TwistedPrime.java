class TwistedPrime {
    public static void main(String[] args) {
        int n = 13;
        if (isPrime(n)) {
            int rev = reverse(n);
            if (isPrime(rev)) {
                System.out.println("Twisted");
            } else {
                System.out.println("Not Twisted");
            }

        } else {
            System.out.println("Not a Prime");
        }
    }
    public static boolean isPrime(int n) {
        int den = 2;
        while (den < n) {
            if (n % den == 0) {
                break;
            }
            den++;
        }
        return den == n;
    }
    public static int reverse(int n) {
        int rev = 0;
        for (int i = n;i>0; i/= 10) {
            rev = rev * 10 + (i % 10);
        }
        return rev;
    }
}