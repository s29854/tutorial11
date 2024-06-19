public class Main {
    public static void main(String[] args) throws AccountOperationException {
        Admin admin1 = new Admin("John", "Doe");

        Employee employee1 = admin1.createEmployee("Jan", "Nowak");
        Employee employee2 = admin1.createEmployee("Marian", "Kowalski");

        Client client1 = employee1.addClient("Zbigniew", "Zuk");
        Client client2 = employee1.addClient("Jakub", "Kamien");
        Client client3 = employee1.addClient("John", "Stone");
        Client client4 = employee1.addClient("Albert", "Kowalski");

        BankAccount bankAccount1 = client1.getBankAccount();
        BankAccount bankAccount2 = client2.getBankAccount();
        BankAccount bankAccount3 = client3.getBankAccount();
        BankAccount bankAccount4 = client4.getBankAccount();

        employee1.depositToAccount(bankAccount1, 100);
        employee2.depositToAccount(bankAccount2, 200);
        admin1.depositToAccount(bankAccount3, 300);
        admin1.depositToAccount(bankAccount4, 500);

        admin1.makeTransaction(bankAccount1, bankAccount2, 10);
        employee2.makeTransaction(bankAccount4, bankAccount3, 200);
        employee1.makeTransaction(bankAccount3, bankAccount1, 20);
        admin1.makeTransaction(bankAccount2, bankAccount4, 100);
        admin1.makeTransaction(bankAccount3, bankAccount2, 60);
        employee2.makeTransaction(bankAccount3, bankAccount1, 20);
        employee2.makeTransaction(bankAccount2,bankAccount1, 5);
        employee2.makeTransaction(bankAccount4, bankAccount2, 3.6);
        employee1.makeTransaction(bankAccount3, bankAccount2, 6.8);
        admin1.makeTransaction(bankAccount1, bankAccount2, 2);

        System.out.println("Account1 balance: "+bankAccount1.checkBalance()+"\nAccount3 balance: "+bankAccount2.checkBalance()
                +"\nAccount3 balance: "+bankAccount3.checkBalance()+"\nAccount4 balance: "+ bankAccount4.checkBalance());
    }
}