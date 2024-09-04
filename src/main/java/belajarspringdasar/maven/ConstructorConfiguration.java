package belajarspringdasar.maven;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajarspringdasar.maven.component.repository",
        "belajarspringdasar.maven.service"
})
public class ConstructorConfiguration {
}
