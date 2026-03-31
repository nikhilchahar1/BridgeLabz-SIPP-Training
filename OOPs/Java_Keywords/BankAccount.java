class BankAccount {
    // Static variable shared across all instances
    static String bankName = "ABC Bank";

    // Static variable to track total accounts
    private static int totalAccounts = 0;

    // Final variable for account number
    private final int accountNumber;

    // Instance variable
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    // Method to display account details (only if object is instance of BankAccount)
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid object.");
        }
    }
}

public class BankAccount{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Nikhil", 1001);
        BankAccount acc2 = new BankAccount("Aman", 1002);

        acc1.displayDetails();
        System.out.println("-------------------");
        acc2.displayDetails();

        // Show total accounts
        BankAccount.getTotalAccounts();
    }
}
