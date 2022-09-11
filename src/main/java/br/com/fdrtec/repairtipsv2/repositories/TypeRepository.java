package br.com.fdrtec.repairtipsv2.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fdrtec.repairtipsv2.entities.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, UUID>{
    
}
