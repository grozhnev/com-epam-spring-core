import java.io.File;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {

    int cacheSize;
    List<Event> cache;

    public CacheFileEventLogger(File file) {
        super(file);
    }

    public CacheFileEventLogger(String fileName) {
        super(fileName);
    }


    public  CacheFileEventLogger(Integer cacheSize) {
        this.cacheSize = cacheSize;
    }


    public void logEvent(Event event){
        cache.add(event);

        if(cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy(){
        if(!cache.isEmpty()){
            writeEventsFromCache();
        }
    }

    private void writeEventsFromCache() {
        //write events to file
    }

}
