package belajarspringdasar.maven;

import belajarspringdasar.maven.data.LyfeCicle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLyfeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanLyfeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testLyfeCycle() {
        LyfeCicle lyfeCycle = applicationContext.getBean(LyfeCicle.class);
    }

}
