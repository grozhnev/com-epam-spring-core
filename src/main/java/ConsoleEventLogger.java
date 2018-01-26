public class ConsoleEventLogger  implements EventLogger{
    void logEvent(String msg){
        System.out.println(msg);
    }
}
