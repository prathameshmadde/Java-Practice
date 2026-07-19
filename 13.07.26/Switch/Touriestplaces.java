package Switch;
import java.util.Scanner;
public class Touriestplaces {

    public static void main(String[] args) {
            
    Scanner sc =new Scanner(System.in);

        System.out.println(" Enter the city name in Maharashtra:");
        String city=sc.nextLine();

        switch (city) {
            case "Pune":System.out.println("Shaniwar Wada, Aga Khan Palace, Sinhagad Fort");
                
                break;
                case "Mumbai":System.out.println("Gateway of India, Marine Drive, Elephanta Caves");
                
                break;
                case "Nashik":System.out.println("Trimbakeshwar Temple, Sula Vineyards, Pandavleni Caves");
                
                break;
                case "Aurangabad":System.out.println("Ajanta Caves, Ellora Caves, Bibi Ka Maqbara");
                
                break;
                case "Nagpur ":System.out.println("Deekshabhoomi, Futala Lake, Ramtek");
                
                break;
                case "Kolhapur ":System.out.println("Mahalaxmi Temple, Panhala Fort, Rankala Lake");
                
                break;
        
            default:    System.out.println("Invalid City! Please enter a valid city.");
                break;
        }

    }

}
