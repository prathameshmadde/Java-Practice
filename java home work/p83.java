class P83 {
    public static void main(String[] args) {
        int a=4;
        int x=a++ + ++a*a--;
        int y=--a + a++*++a;
        System.out.println(a+" "+x+" "+y);
    }
}