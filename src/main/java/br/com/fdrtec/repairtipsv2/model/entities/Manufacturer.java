package br.com.fdrtec.repairtipsv2.model.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Manufacturer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id    
    private UUID id;
    private String manufacturerName;
    private String description;
}
