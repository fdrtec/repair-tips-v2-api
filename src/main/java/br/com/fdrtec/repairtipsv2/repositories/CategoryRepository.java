package br.com.fdrtec.repairtipsv2.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fdrtec.repairtipsv2.domain.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID>{

}