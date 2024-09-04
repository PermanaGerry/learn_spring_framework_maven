package belajarspringdasar.maven;

import belajarspringdasar.maven.service.ComponentService;
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
        ComponentService componentService = applicationContext.getBean(ComponentService.class);
        ComponentService componentService1 = applicationContext.getBean("componentService", ComponentService.class);

        Assertions.assertNotNull(componentService);
        Assertions.assertSame(componentService, componentService1);
    }

}
