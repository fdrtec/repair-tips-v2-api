package br.com.fdrtec.repairtipsv2.entities;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table
public class Type {
    
    @Id
    @GeneratedValue()
    private UUID id;
    
    @Column()
    private String name;
    
    private List<Model> models;
    
    
}