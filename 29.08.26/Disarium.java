class Disarium {
    public static void main(String[] args) {
        System.out.println(isDisarium(135));
    }
    public static boolean isDisarium(int n) {
        int count = count(n);
        int sum = 0;
        for (int i = n; i != 0; i /= 10, count--) {
            sum = sum + power(i % 10, count);
        }
        return sum == n;
    }
    public static int count(int n) {
        int ct = 0;

        while (n > 0) {

            ct++;
            n /= 10;
        }

        return ct;
    }
    public static int power(int dg, int p) {
        int pow = 1;
        while (p > 0) {
            pow *= dg;
            p--;
        }
        return pow;
    }
}