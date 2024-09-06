package belajarspringdasar.maven;

import belajarspringdasar.maven.client.PaymentGatewayClient;
import belajarspringdasar.maven.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
