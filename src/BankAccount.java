public class BankAccount implements Measurable, Comparable<BankAccount> {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getValue() {
        return balance;
    }

    @Override
    public int compareTo(BankAccount other) {
        // should return a 0 if this is the same (equal to other) as other
        // should return a negative number if this < other
        // should return a positive number if this > other

        if (this.balance == other.balance) {
            return 0;
        }
        else if (this.balance < other.balance) {
            return -1;
        }
        else {
            return 1;
        }

    }
}
