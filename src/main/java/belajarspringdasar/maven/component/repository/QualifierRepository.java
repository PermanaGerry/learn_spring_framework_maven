package belajarspringdasar.maven.component.repository;

import belajarspringdasar.maven.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QualifierRepository {


    @Primary
    @Bean
    public QualifierRepository firstQualifierRepository() {
        return new QualifierRepository();
    }

    @Bean
    public QualifierRepository secondQualifierRepository() {
        return new QualifierRepository();
    }

}
