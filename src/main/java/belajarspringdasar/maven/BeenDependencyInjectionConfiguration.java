package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import belajarspringdasar.maven.data.FooBaz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dependency Injection
 * teknik dimana kita bisa mengotomisasi proses pembuatan object yang tergantung dengan object lain,
 * atau kita sebut dependency
 */
@Configuration
public class BeenDependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Baz baz() {
        return new Baz();
    }

    @Bean
    public FooBaz fooBaz(Foo foo, Baz baz) {
        return new FooBaz(foo, baz);
    }

}
