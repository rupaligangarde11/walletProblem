import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void checkWhetherMoneyIsAddedToWallet() {
        Account account = new Account(0);
        account.addMoney(20);
        assertEquals("20.0", account.toString());
    }

    @Test
    public void checkWhetherNewAmountIsAddedtoWallet() {
        Account account = new Account(0);
        account.addMoney(20);
        assertEquals("20.0", account.toString());
        account.addMoney(20);
        assertEquals("40.0", account.toString());
    }

    @Test
    public void checkIfWalletIsEmpty() {
        Account account = new Account(0);
        assertTrue(account.isEmpty());
    }

    @Test
    public void checkIfMoneyIsWithdrawn() throws Exception {
        Account account = new Account(30);
        account.withdraw(20);
        assertEquals("10.0", account.toString());
    }
    
    @Test
    public void shouldNotBeAddedIfAmountGivenIsNegative(){
        Account account = new Account(10);
        account.addMoney(-90);
        assertEquals("10.0", account.toString());
    }

    @Test
    public void shouldAllowWithdraw500IfBalanceIs400() {
        Account account = new Account(400);
        account.withdraw(500);
        assertEquals("-100.0", account.toString());
    }
}
