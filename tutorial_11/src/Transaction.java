public class Transaction {
    private double transactionAmount;
    private BankAccount fromAccount;
    private BankAccount toAccount;

    public Transaction(double transactionAmount, BankAccount fromAccount, BankAccount toAccount) {
        this.transactionAmount = transactionAmount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public BankAccount getFromAccount() {
        return fromAccount;
    }

    public BankAccount getToAccount() {
        return toAccount;
    }
}
