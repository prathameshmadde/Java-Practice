import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String name1=sc.nextLine();
        
        System.out.println("enter your last name :");
        String name2=sc.nextLine();

        System.out.println("enter your Age :");
        int age=sc.nextInt();
        System.out.println("enter your Gender :");
        String Gender=sc.nextLine();
        System.out.println("enter your address:");
        String location=sc.nextLine();
        System.out.println("enter your state :");
        String state=sc.nextLine();
        System.out.println("enter your country  :");
        String country=sc.nextLine();
    
        System.out.println("Name :"+name1+" "+name2);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+Gender);
        System.out.println("address :"+location);
        System.out.println("state :"+state);
        System.out.println("country :"+country);
    } 
}
