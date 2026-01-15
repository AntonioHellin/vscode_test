public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private double minimumBalance; // Minimum valuation
    private boolean isActive; // State: active or inactive

    // Constructor
    public BankAccount(String accountNumber, String ownerName, double initialBalance, double minimumBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.minimumBalance = minimumBalance;
        this.isActive = true; // Default state
    }

    // Getters
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

    // Methods for basic banking operations
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds or below minimum balance.");
        }
    }

    public void closeAccount() {
        isActive = false;
    }

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