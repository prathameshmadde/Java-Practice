class P95 {
    public static void main(String[] args) {
        char ch='H';
        byte a=120;
        int b=ch+a++;
        double c=(double)(b%10)/4;
        boolean x=(++a<0)||(b++>190&&++ch>'H');
        int d=x?(int)(c*10):(int)ch-a;
        System.out.println(ch+" "+a+" "+b+" "+c+" "+x+" "+d);
    }
}