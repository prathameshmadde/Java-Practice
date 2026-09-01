class P77 {
    public static void main(String[] args) {
        int a=8,b=3,c=2;
        int x=a++ + b*--c;
        int y=++a*(b++ + c);
        System.out.println(a+" "+b+" "+c+" "+x+" "+y);
    }
}