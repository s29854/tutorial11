import java.util.ArrayList;

public class BankAccount implements AccountTransactions{
    private double accountBalance;
    private ArrayList<Transaction> transactions;

    private BankAccount() {
        this.accountBalance = 0.0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void makeTransaction() {

    }

    @Override
    public void depositFunds() {

    }
}
