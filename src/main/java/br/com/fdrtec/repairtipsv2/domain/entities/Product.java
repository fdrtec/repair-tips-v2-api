package br.com.fdrtec.repairtipsv2.domain.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;    
    
    @Id
    private UUID id;
    private String productName;
    private String productCode;
    private Manufacturer manufacturer;
    private Type type;

    // @ManyToMany
    // private List<Part> parts;
}
