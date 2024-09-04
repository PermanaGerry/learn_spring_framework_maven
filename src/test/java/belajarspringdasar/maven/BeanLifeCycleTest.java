package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleConfiguration.class);
//        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testLifeCycle() {
        Connection connection = applicationContext.getBean(Connection.class);
    }

}
