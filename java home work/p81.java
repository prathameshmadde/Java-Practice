class P81 {
    public static void main(String[] args) {
        int a=9;
        double b=4.8;
        double x=a%2==1?a:b;
        int y=(int)(x*2);
        char z=(char)(y+60);
        System.out.println(x+" "+y+" "+z);
    }
}