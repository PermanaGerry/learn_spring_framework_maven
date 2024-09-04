package belajarspringdasar.maven.data;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(Connection.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Connection open");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Connection close");
    }

}
