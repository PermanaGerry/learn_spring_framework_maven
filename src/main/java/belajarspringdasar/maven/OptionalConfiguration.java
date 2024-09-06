package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import belajarspringdasar.maven.data.FooBaz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBaz fooBaz(Optional<Foo> foo, Optional<Baz> baz) {
        return new FooBaz(foo.orElse(null), baz.orElse(null));
    }
}
