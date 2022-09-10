package br.com.fdrtec.repairtipsv2.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;    
    
    @Id
    private UUID id;
    private String modelName;
    private String modelCode;
    private Manufacturer manufacturer;
    private Category category;
    private Type type;

    // @ManyToMany
    // private List<Part> parts;
}
