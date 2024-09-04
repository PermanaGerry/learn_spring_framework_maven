package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }
}
