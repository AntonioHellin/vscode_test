/**
 * Represents a bank account with basic banking operations.
 * Manages balance, minimum balance validation, and account status.
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private double minimumBalance; // Minimum valuation
    private boolean isActive; // State: active or inactive

    /**
     * Initializes a bank account.
     */
    public BankAccount(String accountNumber, String ownerName, double initialBalance, double minimumBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.minimumBalance = minimumBalance;
        this.isActive = true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    /** Deposits money if amount is positive. */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    /** Withdraws money if sufficient funds and minimum balance maintained. */
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds or below minimum balance.");
        }
    }

    /** Closes the account. */
    public void closeAccount() {
        isActive = false;
    }

    /** Reopens the account. */
    public void reopenAccount() {
        isActive = true;
    }

    // Override toString for testing
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", minimumBalance=" + minimumBalance +
                ", isActive=" + isActive +
                '}';
    }
}