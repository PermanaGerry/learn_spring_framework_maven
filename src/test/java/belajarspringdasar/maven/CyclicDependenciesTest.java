package belajarspringdasar.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicDependenciesTest {

    @Test
    void testCyclic() {

        // test if there is an exception message, ignore it
        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(CircularDependenciesConfiguration.class);
        });

        // test fail message cyclic error and trace message cyclic
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(CircularDependenciesConfiguration.class);
            Assertions.fail("It must be fail because cyclic");
        } catch (BeansException be) {
            be.printStackTrace();
        }
    }
}
