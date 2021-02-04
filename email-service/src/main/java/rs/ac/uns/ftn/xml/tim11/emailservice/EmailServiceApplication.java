package rs.ac.uns.ftn.xml.tim11.emailservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rs.ac.uns.ftn.xml.tim11.emailservice.usecase.EmailSender;

@SpringBootApplication
public class EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(
			EmailSender emailSender) {
		return args -> {
			sendEmail(emailSender);
		};
	}

	private void sendEmail(EmailSender emailSender) {
		emailSender.sendEmail("nikolakabasaj6@gmail.com", "nekome", "uspesno poslato");
	}
}
