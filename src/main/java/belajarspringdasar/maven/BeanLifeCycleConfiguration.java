package belajarspringdasar.maven;

import belajarspringdasar.maven.data.Connection;
import belajarspringdasar.maven.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() { return new Server(); }
}
