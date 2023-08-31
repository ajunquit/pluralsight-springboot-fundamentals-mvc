package com.pluralsight;

import com.pluralsight.springbootfundamentals.entity.Application;
import com.pluralsight.springbootfundamentals.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootFundamentalsApplication {
	//private static final Logger log = LoggerFactory.getLogger(SpringbootFundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFundamentalsApplication.class, args);
		System.out.println("Hello World!");
	}

	/*@Bean
	public CommandLineRunner app(ApplicationRepository repository){
		return (args) -> {
			repository.save(new Application("Trackzilla", "Applications for tracking bugs.", "kesha.williams"));
			repository.save(new Application("Expense", "Application to track expense reports.", "mary.jones"));
			repository.save(new Application("Notifications", "Application to send alerts and notifications.", "karen.kane"));

			for (Application application: repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}*/
}
