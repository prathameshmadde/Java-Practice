import java.util.Scanner;
class NextPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = n + 1; ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }   
        int dn = 2;
        while (dn * dn <= n) { 
            if (n % dn == 0) {
                return false; 
            }
            dn++;
        }
        return true;
    }
}