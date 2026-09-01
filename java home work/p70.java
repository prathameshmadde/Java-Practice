class P70 {
    public static void main(String[] args) {
        int a=5,b=10;
        int c=(a++<b)?++a:--b;
        int d=(a==7)?b++:a++;
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}