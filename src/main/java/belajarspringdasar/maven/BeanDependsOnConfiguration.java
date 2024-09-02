package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * Bean Depends on
 * adalah bean utama dibuat setelah itu bean yang tergantung akan dibuat
 */
@Configuration
@Slf4j
public class BeanDependsOnConfiguration {

    @Bean
    @DependsOn({
            "baz"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public  Baz baz() {
        log.info("Create new baz");
        return new Baz();
    }

}
