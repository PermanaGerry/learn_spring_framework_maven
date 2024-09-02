package belajarspringdasar.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application context
 *
 * application context adalah sebuah interface reprentasi container IoC di spring
 */
public class ApplicationContextTest {
    @Test
    void testApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfigration.class);

        Assertions.assertNotNull(context); // true
    }
}
