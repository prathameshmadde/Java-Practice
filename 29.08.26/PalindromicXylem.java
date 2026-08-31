class PalindromicXylem {
    public static void main(String[] args) {
        int n = 9339;
        if (isPalindrome(n) && isXylem(n)) {
            System.out.println("Palindromic Xylem");
        } else {
            System.out.println("Not Palindromic Xylem");
        }
    }
    public static boolean isPalindrome(int n) {
        int rev = 0;
        for (int i = n; i > 0; i /= 10) {
            rev = rev * 10 + (i % 10);
        }
        return n == rev;
    }
    public static boolean isXylem(int n) {
        int sumOfEnd = 0;
        int sumOfMid = 0;
        sumOfEnd += n % 10;
        n /= 10;

        while (n > 9) {
            sumOfMid += n % 10;
            n /= 10;
        }
        sumOfEnd += n;
        return sumOfEnd >= sumOfMid;
    }
}