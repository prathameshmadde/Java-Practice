class P96 {
    public static void main(String[] args) {
        int a=6,b=10,c=14;
        double d=2.5;
        boolean x=(a++<b&&b++<c)||(--c<a);
        int p=(int)(d*a)+b%3;
        double q=x?p+d:(c--*d)-a;
        System.out.println(a+" "+b+" "+c+" "+d+" "+x+" "+p+" "+q);
    }
}