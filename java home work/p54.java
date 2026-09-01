class P54 {
    public static void main(String[] args) {
        int a=6;
        int b=a++*2;
        a+=b++;
        System.out.println(a+" "+b);
    }
}