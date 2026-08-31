class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
    public static int reverse(int n) {
        int rev = 0;
        for (int i = n; i > 0; i /= 10) {
            rev = rev * 10 + (i % 10);
        }
        return rev;
    }
}