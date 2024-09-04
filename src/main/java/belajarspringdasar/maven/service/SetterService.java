package belajarspringdasar.maven.service;

import belajarspringdasar.maven.component.repository.SetterRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterService {

    @Getter
    private SetterRepository setterRepository;

    @Autowired
    public void setSetterRepository(SetterRepository setterRepository) {
        this.setterRepository = setterRepository;
    }
}
