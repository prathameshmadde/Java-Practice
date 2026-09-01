class P90 {
    public static void main(String[] args) {
        double a=514.99;
        int b=(int)a;
        short c=(short)b;
        byte d=(byte)c;
        char e=(char)d;
        int f=e+d;
        System.out.println(b+" "+c+" "+d+" "+(int)e+" "+f);
    }
}