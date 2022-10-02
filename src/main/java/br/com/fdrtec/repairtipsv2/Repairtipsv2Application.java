package br.com.fdrtec.repairtipsv2;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fdrtec.repairtipsv2.model.entities.Category;
import br.com.fdrtec.repairtipsv2.model.entities.Type;
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
		Category category = new Category(null, "Impressoras", new ArrayList<>());
		Type laserType = new Type(null, "Laser", category );
		Type jatoTintaType = new Type(null, "Jato de Tinta", category );
		
		category.getTypes().addAll(Arrays.asList(laserType, jatoTintaType ));

		this.categoryRepository.saveAll(Arrays.asList(category));
		this.typeRepository.saveAll(Arrays.asList(laserType, jatoTintaType));
	}

}
