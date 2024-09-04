package belajarspringdasar.maven.scan;

import belajarspringdasar.maven.data.Baz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BazConfiguration {

    @Bean
    public Baz baz() {
        return new Baz();
    }

}
