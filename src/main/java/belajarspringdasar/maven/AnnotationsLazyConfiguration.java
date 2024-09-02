package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 * Bean Lazy
 * adalah bean yang dibuat bila dibutuhkan atau dipanggil
 */

@Slf4j
@Configuration
public class AnnotationsLazyConfiguration {

    private static final Logger log = LogManager.getLogger(AnnotationsLazyConfiguration.class);

    @Bean
    @Lazy
    @DependsOn({
            "baz"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Baz baz() {
        log.info("Create new Baz");
        return new Baz();
    }

}
