package br.com.fdrtec.repairtipsv2.entities;

import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Model {
    
    private UUID id;
    private String name;
    private String code;
    private List<Part> parts;
}
