class P53 {
    public static void main(String[] args) {
        int a=5;
        int b=a++ + a++;
        int c=++a + ++a;
        System.out.println(a+" "+b+" "+c);
    }
}