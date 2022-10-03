package br.com.fdrtec.repairtipsv2.domain.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fdrtec.repairtipsv2.domain.entities.Type;
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

    @JsonIgnoreProperties("category")
    private List<Type> types;
}
