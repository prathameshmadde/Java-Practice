class RangeOfPrime {
    public static void main(String args[]) {
        isPrime(100, 200);
    }

    public static void isPrime(int start, int end) {
        while (start <= end) {
            if (isPrime(start))
                System.out.println(start);

            start++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        int den = 2;

        while (den * den <= n) {
            if (n % den == 0) {
                return false;
            }

            den++;
        }

        return true;
    }
}