class LCM {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 12;
        int lcm = lcmOfNum(n1, n2);

        System.out.println("LCM is: " + lcm);
    }
    public static int lcmOfNum(int n1, int n2) {
        int large = n1 > n2 ? n1 : n2;

        for (int i = 1; ; i++) {
            if ((large * i) % n1 == 0 &&
                (large * i) % n2 == 0) {
                return large * i;
            }
        }
    }
}