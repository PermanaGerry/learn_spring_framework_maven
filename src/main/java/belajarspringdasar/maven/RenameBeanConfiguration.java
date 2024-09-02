package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RenameBeanConfiguration {

    @Primary
    @Bean(value = "firstBean")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(value = "secondBean")
    public Foo foo2() {
        return new Foo();
    }

}
