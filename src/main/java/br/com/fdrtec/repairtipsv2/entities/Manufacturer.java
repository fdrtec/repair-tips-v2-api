package br.com.fdrtec.repairtipsv2.entities;

import java.util.UUID;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Manufacturer {

    private UUID id;
    private String name;
    private String description;
}
