class P87 {
    public static void main(String[] args) {
        char ch='A';
        int x=ch++ + 4;
        boolean y=ch>'C'&&++x%2==1;
        char z=(char)(y?x+ch:x-ch);
        System.out.println(ch+" "+x+" "+y+" "+z);
    }
}