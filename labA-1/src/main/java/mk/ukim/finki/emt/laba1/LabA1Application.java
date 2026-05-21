package mk.ukim.finki.emt.laba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LabA1Application {

    public static void main(String[] args) {
        SpringApplication.run(LabA1Application.class, args);
    }

}
