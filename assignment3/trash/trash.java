import java.util.Scanner;
import java.util.InputMismatchException;

class Main{

    public static void intro(){
        System.out.println("Choose one of the options to continue");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("================================");
    }

    public static void main(String [] args){
        System.out.println("WELCOME TO CS-bank!");
        System.out.println("================================");
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank(input);

        int option = 0;
        do{
            try{
                intro();
                System.out.print("Enter your choice : ");
                option = input.nextInt();
                input.nextLine();
                switch(option){
                    case 1:
                        bank.check_balance();
                        break;
                    case 2:
                        bank.deposit();
                        break;
                    case 3:
                        bank.withdraw();
                        break;
                    case 4:
                        bank.outro();
                        break;
                    default:
                        System.out.println("Invalid choice! NUMBERS 1 - 4 ONLY!");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid choice! NUMBERS 1 - 4 ONLY!");
                input.nextLine();
            }
        }while(option != 4);

    }
}

class Bank{
    private final Scanner input;
    private String account_name_ = "account-1";
    private double bank_balance_ = 0;

    Bank(Scanner input){
        this.input = input;
    }

    public void get_info(){
        System.out.println("Account name : " + account_name_);
        System.out.println("Balance : Ksh." + bank_balance_);
    }
    public void withdraw(){
        System.out.print("Enter amount to withdraw : ");
        double amt = input.nextDouble();
        input.nextLine();
        if(amt <= 0 || amt > bank_balance_){
            System.out.println("\n********************************");
            System.out.println("Invalid amount! Try again!");
            System.out.println("********************************");
            bank_balance_ -= 0;
        }else{
            System.out.println("\n********************************");
            System.out.println("Successfully withdrawn Ksh." + amt);
            System.out.println("********************************");
            bank_balance_ -= amt;
        }
    }
    public void deposit(){
        System.out.print("Enter amount to deposit : ");
        double amt = input.nextDouble();
        input.nextLine();
        if(amt <= 0){
            System.out.println("\n********************************");
            System.out.println("Invalid amount! Try again!");
            System.out.println("********************************");
            bank_balance_ += 0;
        }else{
            System.out.println("\n********************************");
            System.out.println("Successfully deposited Ksh." + amt);
            System.out.println("********************************");
            bank_balance_ += amt;
        }
    }
    public void check_balance(){
        System.out.println("\n********************************");
        System.out.println("Current bank balance : Ksh." + bank_balance_);
        System.out.println("********************************");
    }
    public void outro(){
        System.out.println("\n********************************");
        System.out.println("THANK YOU FOR VISITING US!");
        System.out.println("********************************");
    }
}