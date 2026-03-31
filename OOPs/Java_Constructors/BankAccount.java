// Base class: BankAccount
public class BankAccount {
    public String accountNumber;      // Public: accessible everywhere
    protected String accountHolder;   // Protected: accessible in subclass
    private double balance;           // Private: only in this class

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}
// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account info
    void displaySavingsAccount() {
        System.out.println("Savings Account Access Demonstration:");
        System.out.println("Accessing Public Account Number: " + accountNumber);
        System.out.println("Accessing Protected Account Holder: " + accountHolder);
        System.out.println("Balance (via getter): ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        // Create a normal bank account
        BankAccount b1 = new BankAccount("1234567890", "Nikhil", 15000);
        System.out.println("Bank Account:");
        b1.displayAccountInfo();

        // Create a savings account
        SavingsAccount sa1 = new SavingsAccount("9876543210", "Aman", 20000, 4.5);
        System.out.println("\n");
        sa1.displaySavingsAccount();
    }
}
