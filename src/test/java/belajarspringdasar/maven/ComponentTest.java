package belajarspringdasar.maven;

import belajarspringdasar.maven.component.repository.QualifierRepository;
import belajarspringdasar.maven.component.repository.SetterFieldBasedRepository;
import belajarspringdasar.maven.component.repository.SetterRepository;
import belajarspringdasar.maven.data.MultiFoo;
import belajarspringdasar.maven.service.ComponentService;
import belajarspringdasar.maven.service.QualifierService;
import belajarspringdasar.maven.service.SetterFieldBasedService;
import belajarspringdasar.maven.service.SetterService;
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
    void testComponentDependencyInjection() {
        ComponentService componentService = applicationContext.getBean(ComponentService.class);
        ComponentService componentService1 = applicationContext.getBean("componentService", ComponentService.class);

        Assertions.assertNotNull(componentService);
        Assertions.assertSame(componentService, componentService1);
    }

    @Test
    void testSetterDependencyInjection() {
        SetterService setterService = applicationContext.getBean(SetterService.class);
        SetterRepository setterRepository = applicationContext.getBean(SetterRepository.class);

        Assertions.assertSame(setterRepository, setterService.getSetterRepository());
    }

    @Test
    void testSetterFieldBasedDependencyInjection() {
        SetterFieldBasedService setterFieldBasedService = applicationContext.getBean(SetterFieldBasedService.class);
        SetterFieldBasedRepository fieldBasedRepository = applicationContext.getBean(SetterFieldBasedRepository.class);

        Assertions.assertSame(fieldBasedRepository, setterFieldBasedService.getSetterFieldBasedRepository());
    }

    @Test
    void testQualifierDependencyInjection() {
        QualifierService qualifierService = applicationContext.getBean(QualifierService.class);

        QualifierRepository firstQualifierRepository = applicationContext.getBean("firstQualifierRepository", QualifierRepository.class);
        QualifierRepository secondQualifierRepository = applicationContext.getBean("secondQualifierRepository", QualifierRepository.class);

        Assertions.assertSame(firstQualifierRepository, qualifierService.getFirstQualifierRepository());
        Assertions.assertSame(secondQualifierRepository, qualifierService.getSecondQualifierRepository());
    }

    @Test
    void testObjectProvider() {

        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());

    }

}
