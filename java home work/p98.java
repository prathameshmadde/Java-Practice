class P98 {
    public static void main(String[] args) {
        int a=9,b=4;
        double c=3.6;
        char ch='F';
        int x=(int)c+a++%b;
        boolean y=(a>b)&&((++b<c)||(ch++>'F'));
        double z=y?(x+ch)/(b+1.0):c+a;
        byte p=(byte)z;
        int q=p+(--a)*2;
        System.out.println(a+" "+b+" "+c+" "+ch+" "+x+" "+y+" "+z+" "+p+" "+q);
    }
}