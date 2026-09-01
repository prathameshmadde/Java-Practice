class P86 {
    public static void main(String[] args) {
        int a=12,b=5;
        double c=2.5;
        int x=(int)(a/c);
        boolean y=x++<b||++a%3==1;
        double z=y?a+c:b-c;
        System.out.println(a+" "+b+" "+c+" "+x+" "+y+" "+z);
    }
}