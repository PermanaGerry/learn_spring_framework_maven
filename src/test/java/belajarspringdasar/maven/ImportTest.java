package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ImportTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testImport() {
        Foo foo = applicationContext.getBean(Foo.class);
        Baz baz = applicationContext.getBean(Baz.class);
    }

}