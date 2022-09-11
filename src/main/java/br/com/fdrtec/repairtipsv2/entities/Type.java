package br.com.fdrtec.repairtipsv2.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Type implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private UUID id;    
    private String typeName;
    // private Category category;       
}

/*
 * {
 *  name: "Laser",
 *  category: "Impressora" 
 * }
 */
