class P51 {
    public static void main(String[] args) {
        int a=3,b=4;
        int x=a++*++b;
        int y=--a+b--;
        System.out.println(a+" "+b+" "+x+" "+y);
    }
}