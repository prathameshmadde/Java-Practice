class P61 {
    public static void main(String[] args) {
        int a=5,b=5;
        boolean x=(a++>5)&&(++b>5);
        boolean y=(a==6)||(++b>6);
        System.out.println(a+" "+b+" "+x+" "+y);
    }
}