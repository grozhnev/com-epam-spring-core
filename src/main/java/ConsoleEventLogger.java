public class ConsoleEventLogger  implements EventLogger{
    /*void logEvent(String msg){
        System.out.println(msg);
    }*/
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
