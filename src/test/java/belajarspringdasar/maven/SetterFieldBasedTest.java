package belajarspringdasar.maven;

import belajarspringdasar.maven.component.repository.SetterFieldBasedRepository;
import belajarspringdasar.maven.service.SetterFieldBasedService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterFieldBasedTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(SetterFieldBasedConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testSetterFieldBasedDependencyInjection() {
        SetterFieldBasedService setterFieldBasedService = applicationContext.getBean(SetterFieldBasedService.class);
        SetterFieldBasedRepository fieldBasedRepository = applicationContext.getBean(SetterFieldBasedRepository.class);

        Assertions.assertSame(fieldBasedRepository, setterFieldBasedService.getSetterFieldBasedRepository());
    }

}
