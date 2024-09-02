package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsLazyTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(AnnotationsLazyConfiguration.class);
    }

    @Test
    void testBeanLazy() {
        Foo foo = applicationContext.getBean(Foo.class);
    }

}
