class Pronic {

    public static void main(String[] args) {

        System.out.println(isPronic(20));
    }

    public static boolean isPronic(int n) {

        for (int i = 1; ; i++) {

            if (i * (i + 1) == n)
                return true;

            else if (i * (i + 1) > n)
                return false;
        }
    }
}