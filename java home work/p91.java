class P91 {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        int x=a+=b*=c;
        int y=c-=a/=2;
        System.out.println(a+" "+b+" "+c+" "+x+" "+y);
    }
}