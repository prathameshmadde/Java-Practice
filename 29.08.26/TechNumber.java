class TechNumber {
    public static void main(String[] args) {
        int n = 2025;
        if (isTech(n)) {
            System.out.println("Tech it is");
        } else {
            System.out.println("Not tech");
        }
    }
    public static boolean isTech(int n) {
        int count = count(n);

        if (count % 2 != 0) {
            return false;
        } else {
            int half = count / 2;
            int den = 1;

            for (int i = 0; i < half; i++) {
                den *= 10;
            }
            int left = n / den;
            int right = n % den;
            return left + right == n;
        }
    }
    public static int count(int n) {
        int count = 0;
        for (int i = n; i != 0; i /= 10) {
            count++;
        }
        return count;
    }
}