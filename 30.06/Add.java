public class Add {
    public static void main(String[] args) {
        int a=1;
        int b=2;

        int c=3;
        int largest = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(largest);

        int smallest = (a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println(smallest);


    }
}
