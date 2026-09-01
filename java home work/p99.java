class P99 {
    public static void main(String[] args) {
        byte a=100;
        short b=300;
        char ch='K';
        double d=5.75;
        int x=(int)d+(a++%7);
        boolean y=(a<110&&++ch>'K')||((b-=50)>200&&++a<105);
        int z=y?(int)(d*ch)%100:a+b;
        short p=(short)(z*4);
        char q=(char)(p+ch);
        System.out.println(a+" "+b+" "+ch+" "+d+" "+x+" "+y+" "+z+" "+p+" "+(int)q);
    }
}