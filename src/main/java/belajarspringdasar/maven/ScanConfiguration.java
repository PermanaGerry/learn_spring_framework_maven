package belajarspringdasar.maven;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajarspringdasar.maven.scan"
})
public class ScanConfiguration {
}
