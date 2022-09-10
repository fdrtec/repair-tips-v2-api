package br.com.fdrtec.repairtipsv2.entities;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Part {

    private UUID id;
    private String originTitle;
    private String ptTitle;
    private String partNumber;

}
