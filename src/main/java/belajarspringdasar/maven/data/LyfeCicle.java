package belajarspringdasar.maven.data;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class LyfeCicle implements InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(LyfeCicle.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Properties bean success");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Properties bean destroy");
    }

}
