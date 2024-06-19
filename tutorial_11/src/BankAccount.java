import java.util.ArrayList;

public class BankAccount implements AccountTransactions{
    private double accountBalance;
    private ArrayList<Transaction> transactions;

    private BankAccount() {
        this.accountBalance = 0.0;
        this.transactions = new ArrayList<Transaction>();
    }

    @Override
    public double checkBalance() {
        return this.accountBalance;
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) throws AccountOperationException {
        if(amount <=0 ){
            throw new AccountOperationException("Invalid transfer amount.");
        }
        if(amount>this.accountBalance){
            throw new AccountOperationException("Insufficient funds in the account.");
        }
        this.accountBalance-=amount;
        toAccount.accountBalance+=amount;
        Transaction t = new Transaction(amount, this, toAccount);
        transactions.add(t);
        toAccount.transactions.add(t);
    }
    @Override
    public void depositFunds(double amount) throws AccountOperationException{
        if(amount <=0){
            throw new AccountOperationException("Amount has to be higher than 0.");
        }
        accountBalance+=amount;
        transactions.add(new Transaction(amount, null, this));
    }
    static BankAccount createBankAccount() {
        return new BankAccount();
    }
}
