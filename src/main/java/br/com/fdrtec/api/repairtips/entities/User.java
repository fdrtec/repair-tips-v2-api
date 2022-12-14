package br.com.fdrtec.api.repairtips.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;    
}
