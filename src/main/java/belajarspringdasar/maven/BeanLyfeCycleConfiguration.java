package belajarspringdasar.maven;

import belajarspringdasar.maven.data.LyfeCicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLyfeCycleConfiguration {

    @Bean
    public LyfeCicle lyfeCycle() {
        return new LyfeCicle();
    }
}
