package belajarspringdasar.maven;

import belajarspringdasar.maven.component.repository.SetterRepository;
import belajarspringdasar.maven.service.SetterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterTest {

    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(SetterConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testSetterDependencyInjection() {
        SetterService setterService = applicationContext.getBean(SetterService.class);
        SetterRepository setterRepository = applicationContext.getBean(SetterRepository.class);

        Assertions.assertSame(setterRepository, setterService.getSetterRepository());

    }

}
