class RangeOfArmstrong {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int n) {
        int count = count(n);
        int sum = sumOfPower(count, n);
        return n == sum;
    }
    public static int count(int n) {
        int count = 0;
        for (int i = n; i != 0; i /= 10) {
            count++;
        }
        return count;
    }
    public static int sumOfPower(int digit, int n) {
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            int pos = 1;
            for (int i = 1; i <= digit; i++) {
                pos *= last;
            }
            sum += pos;
            n /= 10;
        }
        return sum;
    }
}