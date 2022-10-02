package br.com.fdrtec.repairtipsv2.model.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Type",schema = "support")
public class Type implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "BINARY(16)")     
    private UUID id; 
    
    @Column(nullable = false, length = 150)       
    private String typeName; 
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;     
}

/* 
 *  typeName: "Laser",
 *  category: "Impressora"  
 */
