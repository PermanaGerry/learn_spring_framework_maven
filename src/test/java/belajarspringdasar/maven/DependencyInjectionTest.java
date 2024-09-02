package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import belajarspringdasar.maven.data.FooBaz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;
    private ApplicationContext applicationNameBeenContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanDependencyInjectionConfiguration.class);
        applicationNameBeenContext = new AnnotationConfigApplicationContext(NameBeenDependencyInjectionConfiguration.class);
    }

    @Test
    void testDI() {
        Foo foo = applicationContext.getBean(Foo.class);
        Baz baz = applicationContext.getBean(Baz.class);
        FooBaz fooBaz = applicationContext.getBean(FooBaz.class);

        Assertions.assertSame(foo, fooBaz.getFoo());
        Assertions.assertSame(baz, fooBaz.getBaz());
    }

    @Test
    void testNameDI() {
        Foo foo = applicationNameBeenContext.getBean(Foo.class);
        Foo fooSecond = applicationNameBeenContext.getBean("fooSecond", Foo.class);
        Baz baz = applicationNameBeenContext.getBean(Baz.class);
        FooBaz fooBaz = applicationNameBeenContext.getBean(FooBaz.class);

        Assertions.assertNotSame(foo, fooBaz.getFoo());
        Assertions.assertSame(fooSecond, fooBaz.getFoo());
        Assertions.assertSame(baz, fooBaz.getBaz());
    }

    @Test
    void testNoDI() {

        var foo = new Foo();
        var baz = new Baz();

        var fooBaz = new FooBaz(foo, baz);

        Assertions.assertSame(foo, fooBaz.getFoo());
        Assertions.assertSame(baz, fooBaz.getBaz());
        Assertions.assertNotSame(foo, baz);
    }

}
