import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month no : ");
        int month = sc.nextInt();

        if ( month==3 || month==4 || month==5 || month==2){
            System.out.println("summer season ");
        }
        else if ( month==6 || month==7 || month==8 || month==9){
            System.out.println("Rainy season ");
        }
        else if ( month==10 || month==11 || month==12|| month==1){
            System.out.println("Wnter season ");
        }
        else{
            System.out.println("Invalid Input.");
        }

    }
}
