package br.com.fdrtec.repairtipsv2.model.dtos;

import java.io.Serializable;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeDTO implements Serializable{
    private static final long serialVersionUID = 1L;    
       
    private UUID id;
    
    @NotBlank   
    private String typeName;
    
    private CategoryDTO categoryDTO;
}

/*
 * {
 *  typeName: "Laser",
 *  category: "Impressora" 
 * }
 */
