package br.com.fdrtec.repairtipsv2.entities;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Model {
    
    private UUID id;
    private String name;
    private String code;
    private Manufacturer manufacturer;
    private Category category;
    private Type type;

    // @ManyToMany
    // private List<Part> parts;
}
