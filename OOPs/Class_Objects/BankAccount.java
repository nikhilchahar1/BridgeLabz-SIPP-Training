public class BankAccount{
    static class BankAccount {
        String accountHolder;
        int accountNumber;
        double balance;

        // Method to deposit money
        void deposit(double amount) {
            balance += amount;
        }

        // Method to withdraw money (if balance is sufficient)
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        // Method to display current balance
        void displayBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        // Create a bank account object
        BankAccount account = new BankAccount();
        account.accountHolder = "Nikhil";
        account.accountNumber = 123456789;
        account.balance = 5000.0;

        // Perform operations
        account.deposit(2000.0);
        account.withdraw(1500.0);
        account.displayBalance();  // Should show ₹5500.0
    }
}
