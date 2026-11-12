class Main{

    public static void main(String [] args)
        throws InterruptedException{
        System.out.println("WELCOME TO Jamii-bank!");
        System.out.println("================================");
        Bank bank = new Bank();

        Thread customerA = new Thread(() -> {
            bank.withdraw(20000); //withdraw
        });
        Thread customerB = new Thread(() -> {
            bank.deposit(15000); //deposits
        });
        Thread customerC = new Thread(() -> {
            bank.transfer(30000); //transfers
        });
        Thread customerD = new Thread(() -> {
            bank.withdraw(25000); //withdraws
        });
        Thread customerE = new Thread(() -> {
            bank.withdraw(10000); //withdraw
        });
        Thread customerF = new Thread(() -> {
            bank.check_balance(); //checks balance
        });

        customerA.start();
        customerB.start();
        customerC.start();
        customerD.start();
        customerE.start();
        customerF.start();

        customerA.join();
        customerB.join();
        customerC.join();
        customerD.join();
        customerE.join();
        customerF.join();

        System.out.println(bank.get_balance());
    }
}

class BankAccount{
    private static double bank_balance_ = 100000;

    public synchronized void withdraw(double amt){
        if(amt <= 0 || amt > bank_balance_){
            bank_balance_ -= 0;
        }else{
            System.out.println("Successfully withdrawn Ksh." + amt);
            bank_balance_ -= amt;
        }
    }
    public synchronized void deposit(double amt){
        if(amt <= 0){
            bank_balance_ += 0;
        }else{
            System.out.println("Successfully deposited Ksh." + amt);
            bank_balance_ += amt;    
        }
    }
    public synchronized void transfer(double amt){
        if(amt <= 0 || amt > bank_balance_){
            bank_balance_ -= 0;
        }else{
            System.out.println("Successfully transferred Ksh." + amt);
            bank_balance_ -= amt;
        }
    }

    //inquiries
    public void check_balance(){
        System.out.println("Current bank balance : Ksh." + bank_balance_);
    }
    public void outro(){
        System.out.println("THANK YOU FOR VISITING US!");
    }
    public synchronized double get_balance(){
        return bank_balance_;
    }
}

//6 quick thread are not enough for the problem to show up and can easily run as expected even if they are not synchronised