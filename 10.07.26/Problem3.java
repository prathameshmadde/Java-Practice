import java.util.Scanner;
public class Problem3 {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter any Character :");
        int ch =sc.next().charAt(0);

        if(ch>=65&&ch<=90){
            System.out.println("The character "+ch+" is UpperCase ");
        }
        if(ch>=97&&ch<=122){
            System.out.println("The character "+ch+" is LowerCase ");
        }
        
        if(ch>'0'&&ch<='9'){
            System.out.println("the character is digit ");
        }
        if((!(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))){
            System.out.println("The character is special character ");
        } 
        
    }
}
