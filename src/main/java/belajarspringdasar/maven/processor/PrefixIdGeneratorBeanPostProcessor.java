package belajarspringdasar.maven.processor;

import belajarspringdasar.maven.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator prefix bean processor", bean);
        if (bean instanceof IdAware) {
            log.info("Id Set Generator prefix bean processor", bean);
            IdAware idAware = (IdAware) bean;
            idAware.setId("ZET-" + idAware.getId());
        }

        return bean;

    }
}
