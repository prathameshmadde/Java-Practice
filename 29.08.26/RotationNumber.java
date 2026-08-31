class RotationNumber {
    public static void main(String[] args) {
        autoRotation(1234);
    }
    public static void autoRotation(int n) {
        int rot = n;
        do {
            rot = rotate(rot);
            System.out.println(rot);
        } while (rot != n);
    }
   public static int rotate(int n) {

        int last = n % 10;
        n /= 10;

        return last * power(n) + n;
    }
   public static int power(int n) {
        int pow = 1;
        while (n > 0) {
            pow *= 10;
            n /= 10;
        }
       return pow;
    }
}