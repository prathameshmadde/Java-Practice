class P93 {
    public static void main(String[] args) {
        int a=7;
        float b=2.5f;
        double c=4.2;
        double x=a++%3==1?b*++a:c/--a;
        int y=(int)x+(a>8?2:3);
        System.out.println(a+" "+b+" "+c+" "+x+" "+y);
    }
}