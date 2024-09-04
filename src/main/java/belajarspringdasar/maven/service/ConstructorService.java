package belajarspringdasar.maven.service;

import belajarspringdasar.maven.component.repository.ConstructorRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ConstructorService {

    @Getter
    private ConstructorRepository constructorRepository;

    public ConstructorService(ConstructorRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
    }

}
