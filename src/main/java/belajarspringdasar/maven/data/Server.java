package belajarspringdasar.maven.data;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Server {

    private static final Logger log = LoggerFactory.getLogger(Server.class);

    public void start() {
        log.info("Start server");
    }

    public void stop() {
        log.info("Stop server");
    }
}
