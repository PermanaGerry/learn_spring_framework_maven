package belajarspringdasar.maven;

import belajarspringdasar.maven.data.cyclic.CyclicA;
import belajarspringdasar.maven.data.cyclic.CyclicB;
import belajarspringdasar.maven.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Circular dependency
 * adalah kasus dimana bean yang saling membutuhkan dan membentuk lingkaran
 */
@Configuration
public class CircularDependenciesConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }

}
