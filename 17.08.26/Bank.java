import java.util.Scanner;

class Bank
{
    static String name;
    static String password;
    static double balance;
    static int upiPin;

    public static void main(String[] args)
    {
        launchApplication();
    }

    public static void launchApplication()
    {
       while(true)
        {
            System.out.println("\n *** WELCOME *** \n");
            System.out.println("1.Create Account \n2.Login");
            System.out.print("Enter option : ");
            int opt = new Scanner(System.in).nextInt();

            switch(opt)
            {
                case 1 -> createAccount();
                case 2 -> login();
                default -> System.out.println("\n INVALID OPTION \n");
            }
        
		}
    }

    public static void homePage()
    {
        while(true)
        {
            System.out.println("\n **** HOME PAGE ****\n");
            System.out.println("1.Deposit \n2.Withdraw \n3.Check Balance \n4.Statement \n5.Logout");
            System.out.print("Enter your option : ");
            int opt = new Scanner(System.in).nextInt();

            switch(opt)
            {
                case 1 -> depositAmount();
                case 2 -> withdrawAmount();
                case 3 -> checkBalance();
                case 4 -> statement();
                case 5 -> logout();
               
				default -> System.out.println("\n INVALID OPTION \n");
            
			}
        }
    }

    public static void depositAmount()
    {
        System.out.println("\n ***** Deposit Module ********\n");
        System.out.print("Enter an amount : ");
        
		double dpAmt = new Scanner(System.in).nextDouble();

        if(dpAmt <= 0)
        {
            System.out.println("\n INVALID AMOUNT \n");
            
			return;
        }

        balance += dpAmt;

        System.out.println("\n AMOUNT Deposited Succ \n");
    }

    public static void withdrawAmount()
    {
        System.out.println("\n ***** Withdraw Module ********\n");
        System.out.print("Enter an amount : ");
        
		double wtdAmt = new Scanner(System.in).nextDouble();

        System.out.print("Enter upi pin : ");
        
		int upiPin1 = new Scanner(System.in).nextInt();

        if(upiPin1 == upiPin)
        {
            if(wtdAmt > balance)
            {	System.out.println("\n INSUFF FUNDS \n");
            }
            else if(wtdAmt <= 0)
            {	System.out.println("\n INVALID AMT\n");
            }
            else
            {	System.out.println("\n AMOUNT DEBITED SUCC\n");

                balance -= wtdAmt;

                System.out.print("Do u want to view Balance (YES/NO): ");
                String resp = new Scanner(System.in).next().toUpperCase();

                if(resp.equals("YES"))
                {	System.out.println("Your account balance is : " + balance + "rs.");
                }
            }
        }
        else
        {	System.out.println("\n INVALID PIN \n");
        }
    }

    public static void checkBalance()
    {
        System.out.println("\n ****** Check Balance Module ********\n");
        System.out.print("Enter your pin : ");
        
		int upiPin1 = new Scanner(System.in).nextInt();

        if(upiPin1 == upiPin)
        {	 System.out.println(name + " your account balance is : " + balance + " rs.");
        }
        else
        {	System.out.println("\n INVALID PIN \n");
        }
    }

    public static void statement()
    {
        System.out.println("\n ****** Statement Module ********\n");
        System.out.println("Account Holder : " + name);
        System.out.println("Current Balance : " + balance + " rs.");
    }

    public static void logout()
    {
        System.out.println("\n ****** THANK U AND VISIT AGAIN ********\n");
        launchApplication();
    }

    public static void login()
    {
        if(name == null)
        {
            System.out.println("\n CREATE YOUR ACCOUNT FIRST \n");
            return;
        }

        System.out.println("\n ***** LOGIN *****\n");

        int attempt = 3;

        do
        {
            System.out.print("Username : ");
            String username1 = new Scanner(System.in).nextLine();

            System.out.print("Password : ");
            String password1 = new Scanner(System.in).next();

            if(name.equals(username1) && password.equals(password1))
            {
                homePage();
                return;
            }

            System.out.println("\n INVALID CRED ");
            System.out.println("Attempts left: " + (--attempt));

        }while(attempt >= 1);

        System.out.println("\n YOUR ACCOUNT IS LOCKED FOR 48 hours \n");
        System.exit(0);
    }

    public static void createAccount()
    {
        if(name != null)
        {
            System.out.println("\n ACCOUNT ALREADY EXIST\n");
            return;
        }

        System.out.println("\n**** CREATE Account ****\n");

        System.out.print("Username : ");
        name = new Scanner(System.in).nextLine();

        System.out.print("password : ");
        password = new Scanner(System.in).next();

        System.out.print("Amount : ");
        balance = new Scanner(System.in).nextDouble();

        System.out.print("UpiPin : ");
        upiPin = new Scanner(System.in).nextInt();

        System.out.println("\n ACCOUNT CREATED SUCC\n");
    }
}