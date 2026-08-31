class BeforeAfterPrime {
    public static void main(String[] args) {
        int n = 20;
        if (isPrime(n)) {
            System.out.println("Number is itself Prime");
        } else {
            int before = 0;
            int after = 0;
            for (int i = 2; ; i++) {
                if (i < n && isPrime(i)) {
                    before = i;
                } 
                else if (i > n && isPrime(i)) {
                    after = i;
                    break;
                }
            }
            if (n - before <= after - n) {
                System.out.println("Nearest: " + before);
            } else {
                System.out.println("Nearest: " + after);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}