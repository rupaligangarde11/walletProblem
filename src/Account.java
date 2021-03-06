public class Account {

    private double totalAmount;

    public Account(double totalAmount) {
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

    public void withdraw(double amount) {
        totalAmount -= amount;
    }
}
