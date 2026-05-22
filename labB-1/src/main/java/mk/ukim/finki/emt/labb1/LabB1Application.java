package mk.ukim.finki.emt.labb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LabB1Application {

    public static void main(String[] args) {
        SpringApplication.run(LabB1Application.class, args);
    }

}
