package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Foo;
import belajarspringdasar.maven.data.FooBaz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionallTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
    }

    @Test
    void testOptional() {
        Foo foo = applicationContext.getBean(Foo.class);
        FooBaz fooBaz = applicationContext.getBean(FooBaz.class);

        Assertions.assertNull(fooBaz.getBaz());
        Assertions.assertSame(foo, fooBaz.getFoo());
    }

}
