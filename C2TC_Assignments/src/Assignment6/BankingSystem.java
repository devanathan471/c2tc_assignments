package Assignment6;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1010, 5000.00);

        // Attempt deposit
        try {
            account.deposit(1500);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Attempt withdrawal
        try {
            account.withdraw(7000); // More than balance
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Attempt invalid deposit
        try {
            account.deposit(-100);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}