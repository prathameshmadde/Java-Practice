class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    public static boolean isArmstrong(int n) {
        int ct = count(n);
        int sum = 0;
        for (int i = n; i != 0; i /= 10) {
            sum += power(i % 10, ct);
        }
        return sum == n;
    }
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static int power(int dg, int ct) {
        int pow = 1;
        while (ct > 0) {
            pow *= dg;
            ct--;
        }
        return pow;
    }
}