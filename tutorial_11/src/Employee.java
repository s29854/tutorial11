import java.util.Objects;

public class Employee extends User {
    private static int employeesCount = 0;
    private String employeeId;

    private Employee(String name, String lastName) {
        super(name, lastName);
        this.employeeId = "E#" + employeesCount++;
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
    static Employee createEmployee(String name, String lastName){
        return new Employee(name, lastName);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getEmployeeId(), employee.getEmployeeId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEmployeeId());
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

