package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Baz;
import belajarspringdasar.maven.data.Foo;
import belajarspringdasar.maven.data.FooBaz;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NameBeenDependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Baz baz() {
        return new Baz();
    }

    @Bean
    public FooBaz fooBaz(@Qualifier("fooSecond") Foo foo, Baz baz) {
        return new FooBaz(foo, baz);
    }

}
