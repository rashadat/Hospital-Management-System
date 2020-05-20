import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.developia.*"} )
@EntityScan(basePackages = {"com.developia.*"})
@EnableJpaRepositories(basePackages = {"com.developia.*"})
public class HMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class);
    }

}
