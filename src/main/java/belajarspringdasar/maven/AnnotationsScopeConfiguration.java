package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Annotations scope
 * Annotations scope di Spring Boot mengontrol lifecycle dan visibilitas dari bean di dalam aplikasi
 *
 * Jenis Scope dalam Spring :
 * 1. Singleton (@Scope("singleton")) [default]
 * 2. Prototype (@Scope("prototype"))
 * 3. Request (@Scope("request"))
 * 4. Session (@Scope("session"))
 * 5. Global Session (@Scope("globalSession"))
 * 6. Application (@Scope("application"))
 */
@Slf4j
@Configuration
public class AnnotationsScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("create new foo");
        return new Foo();
    }

    @Bean
    @Scope("singleton")
    public Baz baz() {
        return new Baz();
    }

}
