package ai.jobiak.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class FirstBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBookAppApplication.class, args);
	}
@GetMapping
public String check() {
	return "chak de India";
}
}
