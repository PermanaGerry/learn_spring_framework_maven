package belajarspringdasar.maven;

import belajarspringdasar.maven.scan.BazConfiguration;
import belajarspringdasar.maven.scan.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BazConfiguration.class
})
public class ImportConfiguration {



}
