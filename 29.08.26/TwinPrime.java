class TwinPrime {

    public static void main(String[] args) {

        System.out.println(isTwin(11, 13));
    }

    public static boolean isTwin(int n1, int n2) {

        if (isPrime(n1) && isPrime(n2) && (n1 - n2 == 2 || n2 - n1 == 2))
            return true;

        return false;
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }
}