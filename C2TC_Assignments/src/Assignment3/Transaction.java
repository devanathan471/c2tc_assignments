package Assignment3;


final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account acc, String type, double amount) {
        System.out.println("\n--- Transaction Start ---");
        if (type.equalsIgnoreCase("deposit")) {
            acc.deposit(amount);
            System.out.println("Transaction Fee: ₹" + transactionFee);
            acc.withdraw(transactionFee);
        } else if (type.equalsIgnoreCase("withdraw")) {
            acc.withdraw(amount + transactionFee);
            System.out.println("Transaction Fee: ₹" + transactionFee);
        } else {
            System.out.println("Invalid transaction type.");
        }
        acc.showAccountDetails();
        System.out.println("--- Transaction End ---\n");
    }
}
