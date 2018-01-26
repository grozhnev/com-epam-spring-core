public class Client {
    String id;
    String fullName;

    Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Client() {
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

}
