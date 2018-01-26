public class App {
    private Client client;
    private ConsoleEventLogger logger;

    private void logEvent(String msg){
        String message = "Bday of #"+client.getId()+" "+client.getFullName();
        logger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "John Doe");
        app.logger = new ConsoleEventLogger();

        app.logEvent(app.client.fullName );

    }
}
