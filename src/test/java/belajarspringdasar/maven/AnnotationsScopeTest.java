package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsScopeTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(AnnotationsScopeConfiguration.class);
    }

    @Test
    void testScopePrototype() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);
    }

    @Test
    void testScopeSingleton() {
        Baz baz = applicationContext.getBean(Baz.class);
        Baz baz1 = applicationContext.getBean(Baz.class);

        Assertions.assertSame(baz, baz1);
    }

}
