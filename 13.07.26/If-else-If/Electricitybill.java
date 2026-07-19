import java.util.Scanner;

public class Electricitybill{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many unites of Electricity used : ");
        int unites = sc.nextInt();

        if (unites>=0 && unites<=100){
            System.err.println("Rate = 5.56/unite\n"+"Total Electricity bill :" + 5.56*unites );
        }
        else if (unites>=101 && unites<=300){
            System.out.println("Rate = 12.40/unite\n"+"Total Electricity bill :" + 12.40*unites );
        }
        else if (unites>=301 && unites<=500){
            System.out.println("Rate = 16.64/unite\n"+"Total Electricity bill :" + 16.64*unites );
        }
        else if (unites>500){
            System.out.println("Rate = 19.13/unite\n"+"Total Electricity bill :" + 19.13*unites );
        }
        else{
            System.out.println("Invalid Input ");
        }
    }
}
