//
public class _90  {
    private double balance;

    public _90 (double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        _90 account = new _90 (500.0);
        account.deposit(150.0);
        System.out.println("Balance: " + account.getBalance());
    }
}