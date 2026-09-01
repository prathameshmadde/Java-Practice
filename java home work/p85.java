class P85 {
    public static void main(String[] args) {
        byte a=100;
        a+=30;
        a*=2;
        a-=50;
        int b=a;
        short c=(short)(b*5);
        System.out.println(a+" "+b+" "+c);
    }
}