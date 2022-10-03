package br.com.fdrtec.repairtipsv2;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fdrtec.repairtipsv2.domain.entities.Category;
import br.com.fdrtec.repairtipsv2.domain.entities.Type;
import br.com.fdrtec.repairtipsv2.repositories.CategoryRepository;
import br.com.fdrtec.repairtipsv2.repositories.TypeRepository;

@SpringBootApplication
public class Repairtipsv2Application implements CommandLineRunner {

	@Autowired
	TypeRepository typeRepository;

	@Autowired
	CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Repairtipsv2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category printer = new Category(null, "Impressoras", new ArrayList<>());
		Category computer = new Category(null, "Computadores", new ArrayList<>());
		
		Type laser = new Type(null, "Laser", printer );
		Type jatoTinta = new Type(null, "Jato de Tinta", printer );
		Type matricial = new Type(null, "Matricial", printer );
		Type termica = new Type(null, "Térmica", printer );
		
		Type notebook = new Type(null, "Notebook", computer );
		Type desktop = new Type(null, "PC", computer );
		
		printer.getTypes().addAll(Arrays.asList(laser, jatoTinta, matricial, termica ));
		computer.getTypes().addAll(Arrays.asList(notebook, desktop));

		this.categoryRepository.saveAll(Arrays.asList(printer, computer));
		this.typeRepository.saveAll(Arrays.asList(laser, jatoTinta, matricial, termica, notebook, desktop));
	}

}
