class P94 {
    public static void main(String[] args) {
        byte a=10;
        int b=20;
        double c=3.5;
        a+=b++%7;
        int x=(int)(c*++a);
        boolean y=x>b&&(a++<15||++b>25);
        double z=y?x/2.0+c:b-c;
        System.out.println(a+" "+b+" "+c+" "+x+" "+y+" "+z);
    }
}