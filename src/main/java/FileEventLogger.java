// /*импорт не работате*/import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger{
    String filename;
    File file;

    public FileEventLogger(File file) {
    }

    public FileEventLogger(String fileName) {
    }

    public FileEventLogger() {
    }

    public void logEvent(Event event) {
    }

//    FileUtils.writeStringToFile(File file, String str, boolean append/*Event event*/){
//
//    }

    public void init() throws IOException{
        this.file = new File(filename);
        //boolean canWrite = this.file.canWrite();
    }


}
