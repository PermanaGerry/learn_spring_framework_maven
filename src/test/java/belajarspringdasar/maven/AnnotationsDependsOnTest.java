package belajarspringdasar.maven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsDependsOnTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext= new AnnotationConfigApplicationContext(AnnotationsDependsOnConfiguration.class);
    }

    @Test
    void testBeanDependsOn() {

    }

}
