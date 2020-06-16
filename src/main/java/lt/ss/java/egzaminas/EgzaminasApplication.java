package lt.ss.java.egzaminas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EgzaminasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EgzaminasApplication.class, args);
	}

	// ...
}

