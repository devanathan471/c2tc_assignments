package Assignment3;

class SavingsAccount extends Account {
    private double interestRate = 0.03; // 3%

    public SavingsAccount(String holder) {
        super(holder);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited in SavingsAccount with interest.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds in SavingsAccount.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}