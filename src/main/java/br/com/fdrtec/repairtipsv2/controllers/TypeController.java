package br.com.fdrtec.repairtipsv2.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fdrtec.repairtipsv2.entities.Type;
import br.com.fdrtec.repairtipsv2.services.TypeService;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping
    public ResponseEntity<List<Type>> findAll() {        
        return ResponseEntity.ok()
        .body(typeService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Type> findById(@PathVariable UUID id) {
        return ResponseEntity.ok()
        .body(typeService.findById(id));
    }
}
