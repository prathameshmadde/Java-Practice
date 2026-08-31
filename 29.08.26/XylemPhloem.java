class XylemPhloem {
    public static void main(String[] args) {
        int n = 1234;
        if (n < 100) {
            System.out.println("Invalid");
        } else {

            if (isXylem(n)) {
                System.out.println("Xylem: " + n);
            } else {
                System.out.println(n + " is Phloem");
            }
        }
    }
    public static boolean isXylem(int n) {
        int sumOfEnd = sumOfEnd(n);
        int sumOfMid = sumOfMid(n);
        return sumOfEnd == sumOfMid;
    }
    public static int sumOfEnd(int n) {
        int last = n % 10;
        while (n > 0) {
            n /= 10;
        }
       return n + last;
    }
    public static int sumOfMid(int n) {
        int sum = 0;
        int num = n / 10;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}