import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("123456789", "John Doe", 1000.0, 100.0);
    }

    @Test
    public void givenInitialAccount_whenGetAccountNumber_thenReturnCorrectNumber() {
        // Given: account is initialized
        // When: getAccountNumber is called
        String accountNumber = account.getAccountNumber();
        // Then: return the correct account number
        assertEquals("123456789", accountNumber);
    }

    @Test
    public void givenInitialAccount_whenGetOwnerName_thenReturnCorrectName() {
        // Given: account is initialized
        // When: getOwnerName is called
        String ownerName = account.getOwnerName();
        // Then: return the correct owner name
        assertEquals("John Doe", ownerName);
    }

    @Test
    public void givenInitialAccount_whenGetBalance_thenReturnInitialBalance() {
        // Given: account is initialized with 1000.0
        // When: getBalance is called
        double balance = account.getBalance();
        // Then: return the initial balance
        assertEquals(1000.0, balance, 0.0001);
    }

    @Test
    public void givenInitialAccount_whenGetMinimumBalance_thenReturnMinimumBalance() {
        // Given: account is initialized with minimum 100.0
        // When: getMinimumBalance is called
        double minimumBalance = account.getMinimumBalance();
        // Then: return the minimum balance
        assertEquals(100.0, minimumBalance, 0.0001);
    }

    @Test
    public void givenInitialAccount_whenIsActive_thenReturnTrue() {
        // Given: account is initialized
        // When: isActive is called
        boolean isActive = account.isActive();
        // Then: return true
        assertTrue(isActive);
    }

    @Test
    public void givenAccount_whenDepositPositiveAmount_thenBalanceIncreases() {
        // Given: account with initial balance 1000.0
        // When: deposit 500.0
        account.deposit(500.0);
        // Then: balance should be 1500.0
        assertEquals(1500.0, account.getBalance(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenAccount_whenDepositNegativeAmount_thenThrowException() {
        // Given: account
        // When: deposit -100.0
        // Then: throw IllegalArgumentException
        account.deposit(-100.0);
    }

    @Test
    public void givenAccount_whenWithdrawValidAmount_thenBalanceDecreases() {
        // Given: account with balance 1000.0 and minimum 100.0
        // When: withdraw 200.0
        account.withdraw(200.0);
        // Then: balance should be 800.0
        assertEquals(800.0, account.getBalance(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenAccount_whenWithdrawAmountBelowMinimum_thenThrowException() {
        // Given: account with balance 1000.0 and minimum 100.0
        // When: withdraw 950.0 (would leave 50.0, below minimum)
        // Then: throw IllegalArgumentException
        account.withdraw(950.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenAccount_whenWithdrawNegativeAmount_thenThrowException() {
        // Given: account
        // When: withdraw -100.0
        // Then: throw IllegalArgumentException
        account.withdraw(-100.0);
    }

    @Test
    public void givenAccount_whenCloseAccount_thenIsActiveFalse() {
        // Given: account is active
        // When: closeAccount is called
        account.closeAccount();
        // Then: isActive should be false
        assertFalse(account.isActive());
    }

    @Test
    public void givenClosedAccount_whenReopenAccount_thenIsActiveTrue() {
        // Given: account is closed
        account.closeAccount();
        // When: reopenAccount is called
        account.reopenAccount();
        // Then: isActive should be true
        assertTrue(account.isActive());
    }

    @Test
    public void givenAccount_whenToString_thenReturnCorrectString() {
        // Given: account is initialized
        // When: toString is called
        String result = account.toString();
        // Then: return the correct string representation
        assertTrue(result.contains("accountNumber='123456789'"));
        assertTrue(result.contains("ownerName='John Doe'"));
        assertTrue(result.contains("balance=1000.0"));
        assertTrue(result.contains("minimumBalance=100.0"));
        assertTrue(result.contains("isActive=true"));
    }
}