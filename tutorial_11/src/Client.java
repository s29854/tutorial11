public class Client extends User {
    private static int clientsCount=0;
    private String clientId;
    private Client(String name, String lastName) {
        super(name, lastName);
        this.clientId = "C#"+clientsCount++;
    }
    static Client createClient(String name, String lastName){
        return new Client(name, lastName);
    }
}

