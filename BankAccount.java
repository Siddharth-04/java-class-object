public class BankAccount {
    String accountHolder;
    String accounNumber;
    double balance;

    public BankAccount(String accountHolder, String accounNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accounNumber = accounNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + this.accounNumber);
        this.displayCurrBalance();
    }
    public void withdraw(double amount) {
        if(amount > this.balance){
            System.out.println("Insufficient Balance");
        }

        this.balance -= amount;
        System.out.println("Withdrawn " + amount + " to " + this.accounNumber);
        this.displayCurrBalance();
    }

    public void displayCurrBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Siddharth", "1234567", 500);
        bankAccount.deposit(500);
        bankAccount.withdraw(300);
    }
}
//Deposited 500.0 to 1234567
//Current Balance: 1000.0
//Withdrawn 300.0 to 1234567
//Current Balance: 700.0
