package belajarspringdasar.maven;

import belajarspringdasar.maven.component.repository.ConstructorRepository;
import belajarspringdasar.maven.service.ConstructorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ConstructorConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testConstructor() {
        ConstructorService constructorService = applicationContext.getBean(ConstructorService.class);
        ConstructorRepository constructorRepository = applicationContext.getBean(ConstructorRepository.class);

        Assertions.assertSame(constructorRepository, constructorService.getConstructorRepository());
    }

}
