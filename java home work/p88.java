class P88 {
    public static void main(String[] args) {
        int a=6,b=10,c=14;
        int x=a++<b?++b:--c;
        int y=b>c?c++:a++;
        int z=x>y?x-y:y-x;
        System.out.println(a+" "+b+" "+c+" "+x+" "+y+" "+z);
    }
}