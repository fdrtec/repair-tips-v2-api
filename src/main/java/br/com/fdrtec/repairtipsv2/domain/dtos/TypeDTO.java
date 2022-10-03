package br.com.fdrtec.repairtipsv2.domain.dtos;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeDTO implements Serializable {
    private static final long serialVersionUID = 1L;    
       
    private UUID id;      
    private String typeName;    
    
    @JsonIgnoreProperties("types")
    private CategoryDTO category;
}

/*
 * {
 *  typeName: "Laser",
 *  category: "Impressora" 
 * }
 */
