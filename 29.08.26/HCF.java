class HCF {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 6;

        int hcf = hcfOfNum(n1, n2);

        System.out.println("HCF is: " + hcf);
    }
    public static int hcfOfNum(int n1, int n2) {
        int small = n1 < n2 ? n1 : n2;

        while (true) {
            if (n1 % small == 0 && n2 % small == 0) {
                return small;
            }
            small--;
        }
    }
}