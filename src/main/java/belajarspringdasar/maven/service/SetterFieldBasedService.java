package belajarspringdasar.maven.service;

import belajarspringdasar.maven.component.repository.SetterFieldBasedRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterFieldBasedService {

    /**
     * Deprecated annotation autowired in private property
     */
    @Getter
    @Autowired
    private SetterFieldBasedRepository setterFieldBasedRepository;

}
