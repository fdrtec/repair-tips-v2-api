package br.com.fdrtec.repairtipsv2.model.dtos;

import java.io.Serializable;
import java.util.UUID;

import br.com.fdrtec.repairtipsv2.model.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeDTO implements Serializable{
    private static final long serialVersionUID = 1L;    
       
    private UUID id;      
    private String typeName;    
    private CategoryDTO category;
}

/*
 * {
 *  typeName: "Laser",
 *  category: "Impressora" 
 * }
 */
