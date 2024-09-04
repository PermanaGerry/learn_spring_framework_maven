package belajarspringdasar.maven;

import belajarspringdasar.maven.component.configuration.Baz;
import belajarspringdasar.maven.component.configuration.Foo;
import belajarspringdasar.maven.component.configuration.FooBaz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("foo", Foo.class);
        Baz baz = applicationContext.getBean("baz", Baz.class);
        FooBaz fooBaz = applicationContext.getBean("fooBaz", FooBaz.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, baz);
        Assertions.assertNotSame(foo, fooBaz);
    }

}
