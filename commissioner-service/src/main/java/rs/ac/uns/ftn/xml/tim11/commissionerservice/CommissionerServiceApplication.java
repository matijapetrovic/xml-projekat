package rs.ac.uns.ftn.xml.tim11.commissionerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.resenje.Resenje;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.rdf.ResenjeRDFRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.ResenjeXmlRepository;

@SpringBootApplication
public class CommissionerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommissionerServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ResenjeXmlRepository xmlRepository, ResenjeRDFRepository rdfRepository) {
		return args -> {
			Resenje resenje = new Resenje();
			resenje.setBrojResenja("Ide gas matorii");

			Long id = xmlRepository.create(resenje);
			resenje = xmlRepository.findById(id).get();

			rdfRepository.saveMetadata(resenje);
		};
	}
}
