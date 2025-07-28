package Assignment3;

public class BankSystemDemo {
    public static void main(String[] args) {
        // Create accounts
        Account acc1 = new SavingsAccount("Rayan Sharma");
        Account acc2 = new CheckingAccount("Pooja Saravanan");

        // Create transaction handler
        Transaction txn = new Transaction();

        // Perform transactions
        txn.performTransaction(acc1, "deposit", 1000);
        txn.performTransaction(acc2, "deposit", 2000);
        txn.performTransaction(acc1, "withdraw", 500);
        txn.performTransaction(acc2, "withdraw", 2500);

        // Display total accounts created
        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
    }
}