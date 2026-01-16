# BankAccount Class

## Overview
A Java class that implements a basic bank account system with essential banking operations. It manages account information, balance tracking, and account status.

## Key Features
- **Account Management**: Store account number, owner name, and account status
- **Balance Management**: Track current balance with minimum balance validation
- **Banking Operations**: Deposit and withdraw money with validation rules
- **Account Control**: Close and reopen accounts as needed

## Class Structure

### Attributes
| Attribute | Type | Purpose |
|-----------|------|---------|
| `accountNumber` | String | Unique identifier for the account |
| `ownerName` | String | Name of the account owner |
| `balance` | double | Current account balance |
| `minimumBalance` | double | Minimum required balance in the account |
| `isActive` | boolean | Account status (active/inactive) |

### Constructor
```java
public BankAccount(String accountNumber, String ownerName, double initialBalance, double minimumBalance)
```
Initializes a new bank account with the provided details and sets it as active by default.

### Core Methods

#### deposit(double amount)
- Adds money to the account
- **Validates**: Amount must be positive
- **Throws**: `IllegalArgumentException` if amount ≤ 0

#### withdraw(double amount)
- Removes money from the account
- **Validates**: Amount must be positive AND resulting balance ≥ minimum balance
- **Throws**: `IllegalArgumentException` if validation fails

#### closeAccount()
- Deactivates the account (sets `isActive` to false)

#### reopenAccount()
- Reactivates the account (sets `isActive` to true)

### Getter Methods
- `getAccountNumber()`: Returns the account number
- `getOwnerName()`: Returns the owner's name
- `getBalance()`: Returns current balance
- `getMinimumBalance()`: Returns minimum required balance
- `isActive()`: Returns account status

## Usage Example
```java
// Create a new account
BankAccount account = new BankAccount("ACC001", "John Doe", 1000, 100);

// Perform transactions
account.deposit(500);      // Balance becomes 1500
account.withdraw(200);     // Balance becomes 1300

// Manage account status
account.closeAccount();    // Account is now inactive
account.reopenAccount();   // Account is active again
```

## Exception Handling
- **Invalid Deposits**: Negative or zero amounts throw `IllegalArgumentException`
- **Invalid Withdrawals**: Insufficient funds or minimum balance violations throw `IllegalArgumentException`

## Notes
- Minimum balance cannot be bypassed during withdrawals
- Accounts start in active state upon creation
- The `toString()` method provides a formatted account summary
