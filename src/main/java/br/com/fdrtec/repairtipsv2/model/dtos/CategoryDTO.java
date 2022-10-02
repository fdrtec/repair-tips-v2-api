package br.com.fdrtec.repairtipsv2.model.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.JoinFormula;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.fdrtec.repairtipsv2.model.entities.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
          
    private UUID id;

    @NotBlank
    private String categoryName;

    @JsonIgnore
    private List<Type> types;
}
