package br.com.fdrtec.repairtipsv2.controllers;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fdrtec.repairtipsv2.model.dtos.TypeDTO;
import br.com.fdrtec.repairtipsv2.model.entities.Type;
import br.com.fdrtec.repairtipsv2.services.TypeService;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Type>> findAll() {        
        return ResponseEntity.ok()
        .body(typeService.findAll());
    }
    
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Type> findById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok()
        .body(typeService.findById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Type> save(@RequestBody @Valid TypeDTO typeDTO) {
        return ResponseEntity.ok().body(typeService.save(typeDTO));        
    }

    // @PostMapping
    // public @ResponseBody Type newType(@Valid Type type) {
    //     typeService.save(type);
    //     return type;
    // }
}
