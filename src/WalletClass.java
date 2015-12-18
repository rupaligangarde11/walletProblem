public class WalletClass {

    private double totalAmount;

    public WalletClass(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addMoney(double amountToBeAdded) {
        if (amountToBeAdded < 0)
            return;
        totalAmount += amountToBeAdded;
    }

    @Override
    public String toString() {
        return "" + totalAmount;
    }

    public boolean isEmpty() {
        return totalAmount == 0;
    }


    public void withdraw(double amount) {
        if (isEmpty() || totalAmount < amount)
            return;
        totalAmount -= amount;
    }
}
