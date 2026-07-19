import java.util.Scanner;

class Incometax{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Your Income :");
    int salary = sc.nextInt();   
    double tax = 0;

    if (salary>=0 && salary<=400000){
        tax=0;
        System.out.println("NO Income tax ");
    }
    else if (salary >400000 && salary<=800000){
        tax=(salary-400000)*0.05;
        System.out.println("5% Income tax applied :"+tax);
    }
    else if (salary>=800001  && salary<=1200000){
        tax=(400000*0.05)+(salary-400000)*0.10;
        System.out.println("10% Income tax applied : "+tax);
    }
    else if (salary>=1200001&& salary<=1600000){
        tax=(400000*0.05)+(400000*0.10)+(salary-400000)*0.15;
        System.out.println("15% Income tax applied :"+tax);
    }
    else if ((salary>=1600001) && (salary<=2000000)){
        tax=(400000*0.05)+(400000*0.10)+(400000*0.15)+(salary-400000)*0.20;
        System.out.println("20% Income tax applied :"+tax);
    }
    else if (salary >= 2000001    && salary<=2400000){
        tax=(400000*0.05)+(400000*0.10)+(400000*0.15)+(400000*0.20)+(salary-400000)*0.25;
        System.out.println("25% Income tax applied :"+tax);
    }
    else if (salary >= 2400000){
        tax=(400000*0.05)+(400000*0.10)+(400000*0.15)+(400000*0.20)+(400000*0.25)+(salary-400000)*0.30;
        System.out.println("30% Income tax applied :"+tax);
    }
    else {
        System.out.println("Invalid Input ");
    }


    }

}