class P84 {
    public static void main(String[] args) {
        int a=3,b=5,c=7;
        boolean x=a++<b&&++b<c||c-->a;
        boolean y=!(a==b)&&(b++>=c||--c<a);
        System.out.println(a+" "+b+" "+c+" "+x+" "+y);
    }
}