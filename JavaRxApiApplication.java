package shajee.ahmad.labs.rx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Ahmad S Alvi
 *
 */
@SpringBootApplication
@EnableAsync
@EnableJpaRepositories
public class JavaRxApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRxApiApplication.class, args);
	}

}
