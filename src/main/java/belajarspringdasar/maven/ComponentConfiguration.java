package belajarspringdasar.maven;

import belajarspringdasar.maven.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "belajarspringdasar.maven.service",
        "belajarspringdasar.maven.component.repository",
        "belajarspringdasar.maven.scan"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
