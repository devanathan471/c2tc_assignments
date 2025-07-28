package Assignment3;


	abstract class Account {
	    protected String accountHolder;
	    protected double balance;

	    public Account(String accountHolder) {
	        this.accountHolder = accountHolder;
	        this.balance = 0.0;
	        Bank.incrementAccountCount(); // Increase when new account is created
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    public void showAccountDetails() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Current Balance: " + getBalance());
	    }
	}
