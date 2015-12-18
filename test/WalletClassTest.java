import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WalletClassTest {

    @Test
    public void checkWhetherMoneyIsAddedToWallet() {
        WalletClass wallet = new WalletClass(0);
        wallet.addMoney(20);
        assertEquals("20.0", wallet.toString());
    }

    @Test
    public void checkWhetherNewAmountIsAddedtoWallet() {
        WalletClass wallet = new WalletClass(0);
        wallet.addMoney(20);
        assertEquals("20.0", wallet.toString());
        wallet.addMoney(20);
        assertEquals("40.0", wallet.toString());
    }

    @Test
    public void checkIfWalletIsEmpty() {
        WalletClass wallet = new WalletClass(0);
        assertTrue(wallet.isEmpty());
    }

    @Test
    public void checkIfMoneyIsWithdrawn() throws Exception {
        WalletClass wallet = new WalletClass(30);
        wallet.withdraw(20);
        assertEquals("10.0", wallet.toString());
    }

    @Test
    public void moneyShouldNotBeWithdrawnIfBalanceIsZero() {
        WalletClass wallet = new WalletClass(0);
        wallet.withdraw(10);
        assertEquals("0.0", wallet.toString());
    }

    @Test
    public void moneyShouldNotBeWithdrawnIfBalanceIsLessThanWithdrawlAmount() throws Exception {
        WalletClass wallet = new WalletClass(10);
        wallet.withdraw(20);
        assertEquals("10.0", wallet.toString());

    }

    @Test
    public void shouldNotBeAddedIfAmountGivenIsNegative() throws Exception {
        WalletClass wallet = new WalletClass(10);
        wallet.addMoney(-90);
        assertEquals("10", wallet.toString());
    }

}
