package belajarspringdasar.maven.application;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import belajarspringdasar.maven.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo() {
        return new Foo();
    }

//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);
//
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingListener()));

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
