package Assignment3;

class CheckingAccount extends Account {
    private double overdraftLimit = 500.0;

    public CheckingAccount(String holder) {
        super(holder);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in CheckingAccount.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded in CheckingAccount.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}