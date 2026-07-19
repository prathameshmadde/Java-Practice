package Switch;
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Day : ");
        String day=sc.nextLine();
        switch (day) {
            case "Monday":{
                System.out.println("color : Red ");
            }
                break;
        
            case "Tuesday":{
                System.out.println("color : Yellow  ");
            }
                break;
                
            case "Wednesday":{
                System.out.println("color : Green  ");
            }
                break;
                
            case "Thursday":{
                System.out.println("color : White  ");
            }
                break;
                
            case "Friday":{
                System.out.println("color : Orange ");
            }
                break;
                
            case "Saturday":{
                System.out.println("color : black ");
            }
                break;

            case "Sunday":{
                System.out.println("color : Purple ");
            }
                break;

            default:
                System.out.println("Invalid input ");
                break;
        }

    }
}
