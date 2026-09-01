class P79 {
    public static void main(String[] args) {
        int a=4,b=7;
        boolean x=a++<b&&++a==6;
        int c=x?a+b++:b-a++;
        boolean y=b>c||a==7;
        System.out.println(a+" "+b+" "+c+" "+x+" "+y);
    }
}