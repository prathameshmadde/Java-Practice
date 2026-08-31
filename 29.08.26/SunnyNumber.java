class SunnyNumber {
    public static void main(String[] args) {
        int n = 24;

        if (isSunny(n)) {
            System.out.println("Sunny");
        } else {
            System.out.println("Not Sunny");
        }
    }
    public static boolean isSunny(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n + 1) {
                return true;
            }
        }

        return false;
    }
}