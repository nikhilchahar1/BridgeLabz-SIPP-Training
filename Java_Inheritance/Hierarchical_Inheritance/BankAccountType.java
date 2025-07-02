// Superclass representing a generic bank account
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBasicInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass for savings account
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayBasicInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass for checking account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayBasicInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Subclass for fixed deposit account
class FixedDepositAccount extends BankAccount {
    int lockInPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayBasicInfo();
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}

// Main class to test the account types
public class BankAccountType {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 15000.0, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 20000.0, 5000.0);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000.0, 12);

        System.out.println("---- Savings Account ----");
        sa.displayAccountType();
        System.out.println("\n---- Checking Account ----");
        ca.displayAccountType();
        System.out.println("\n---- Fixed Deposit Account ----");
        fda.displayAccountType();
    }
}
