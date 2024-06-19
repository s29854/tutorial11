import java.util.ArrayList;

public class Admin extends User{
    private ArrayList<Employee> employees =new ArrayList<Employee>();
    public Admin(String name, String lastName) {
        super(name, lastName);
    }
    public Employee createEmployee(String name, String lastName){
        Employee e = Employee.createEmployee(name, lastName);
        this.employees.add(e);
        return e;
    }
    public void removeEmployee(Employee e){
        if(!employees.contains(e)){
            throw new IllegalArgumentException("There's no such employee.");
        }
        employees.remove(e);
    }
    public Client addClient(String name, String lastName){
        return Client.createClient(name, lastName);
    }
    public BankAccount openBankAccount(){
        return BankAccount.createBankAccount();
    }
    public void depositToAccount(BankAccount account, double amount) throws AccountOperationException {
        account.depositFunds(amount);
    }
    public void makeTransaction(BankAccount fromAccount, BankAccount toAccount, double amount) throws AccountOperationException {
        fromAccount.transfer(toAccount, amount);
    }

}
