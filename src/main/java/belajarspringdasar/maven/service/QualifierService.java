package belajarspringdasar.maven.service;

import belajarspringdasar.maven.component.repository.QualifierRepository;
import belajarspringdasar.maven.data.Foo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QualifierService {

    @Getter
    private QualifierRepository firstQualifierRepository;

    @Getter
    private  QualifierRepository secondQualifierRepository;

    @Autowired
    @Qualifier("firstQualifierRepository")
    public void setFirstQualifierRepository(QualifierRepository firstQualifierRepository) {
        this.firstQualifierRepository = firstQualifierRepository;
    }

    @Autowired
    @Qualifier("secondQualifierRepository")
    public void setSecondQualifierRepository(QualifierRepository secondQualifierRepository) {
        this.secondQualifierRepository = secondQualifierRepository;
    }

}
