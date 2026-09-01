class P92 {
    public static void main(String[] args) {
        int a=2,b=4,c=6;
        boolean x=a++>5&&++b>4||c--==6;
        boolean y=(a>2||++b>10)&&(--c<a);
        System.out.println(a+" "+b+" "+c+" "+x+" "+y);
    }
}