class P100 {
    public static void main(String[] args) {
        byte a=125;
        int b=8;
        double c=2.75;
        char ch='M';
        a+=b++%5;
        int x=(int)(c*++a);
        boolean y=(a++>120&&--b<10)||(++ch>'M'&&x%3==0);
        double z=y?(x/2.0)+ch:(b*c)-a;
        char p=(char)((int)z+a);
        int q=p+(byte)a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ch);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
    }
}