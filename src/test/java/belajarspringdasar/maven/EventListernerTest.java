package belajarspringdasar.maven;

import belajarspringdasar.maven.listener.LoginAgainSuccessListener;
import belajarspringdasar.maven.listener.LoginSuccessListener;
import belajarspringdasar.maven.listener.UserListener;
import belajarspringdasar.maven.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListernerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);

        userService.login("gerry", "gerry");
        userService.login("gerry", "salah");
        userService.login("salah", "salah");
    }

}
