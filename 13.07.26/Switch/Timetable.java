package Switch;

import java.util.Scanner;

class Timetable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day number between 1 to 7:");

        int day = sc.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("1 - Monday    : Java Practice");
                
                break;

                case 2:
                System.out.println("2 - Tuesday   : SQL Practice");
                
                break;

                case 3:
                System.out.println("3 - Wednesday : HTML Practice");
                
                break;

                case 4:
                System.out.println("4 - Thursday  : CSS Practice");
                
                break;
                case 5:
                System.out.println("5 - Friday    : JavaScript Practice");
                
                break;
                
                case 6:
                System.out.println("6 - Saturday  : Project Work");
                
                break;

                case 7:
                System.out.println("7 - Sunday    : Revision");
                
                break;
                
        
            default:System.out.println("Invalid Input ");
                break;
        }
    }
    
}