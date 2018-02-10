import java.text.DateFormat;
import java.util.Date;

public class Event {
    int id;
    String msg;
    Date date;
    DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public Event(Integer integer, String s, String s2) {
    }

    public Event(Integer integer, String s, String s2, Date date) {
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    void toString(String string){
        System.out.println(string);
        df.format(date);
    }
}
