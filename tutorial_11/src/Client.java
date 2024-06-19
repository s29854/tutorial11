public class Client extends User {
    private static int clientsCount=0;
    private String clientId;
    private BankAccount bankAccount;
    private Client (String name, String lastName) {
        super(name, lastName);
        this.clientId = "C#"+clientsCount++;
        this.bankAccount = BankAccount.createBankAccount();
    }
    static Client createClient(String name, String lastName){
        return new Client(name, lastName);
    }

    public static int getClientsCount() {
        return clientsCount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getClientId() {
        return clientId;
    }
}

