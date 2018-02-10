import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger logger;


    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.logger = eventLogger;
    }

    public App() {
    }

    private void logEvent(/*String*/Event msg){
        //String message = "Bday of #"+client.getId()+" "+client.getFullName();
        logger.logEvent(/*message*/msg);
    }

    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext();
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext();

        App app = new App(new Client("1", "John Doe"), new ConsoleEventLogger());
       // app.client = new Client("1", "John Doe");
        //app.logger = new ConsoleEventLogger();
        //app.logEvent(app.client.fullName);

        //ctx.registerShutdownHook();
        ctx.close();

    }
}
