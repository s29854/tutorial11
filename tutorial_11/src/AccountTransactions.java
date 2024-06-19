public interface AccountTransactions {
    double checkBalance();

    void transfer(BankAccount toAccount, double amount) throws AccountOperationException;

    void depositFunds(double amount) throws AccountOperationException;

}
