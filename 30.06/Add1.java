public class Add1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int largest = (a>b?a:b)>(c>d?c:d)?(a>b?a:b):(c>d?c:d);
        System.out.println(largest);
        
        int smallest = (a<b?a:b)<(c<d?c:d)?(a<b?a:b):(c<d?c:d);
        System.out.println(smallest);
    }
}
