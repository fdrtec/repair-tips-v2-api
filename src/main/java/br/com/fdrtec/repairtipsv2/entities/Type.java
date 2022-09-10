package br.com.fdrtec.repairtipsv2.entities;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Type implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id    
    private UUID id;    
    private String typeName;
    private Category category;       
}

/*
 * {
 *  name: "Laser",
 *  category: "Impressora" 
 * }
 */
