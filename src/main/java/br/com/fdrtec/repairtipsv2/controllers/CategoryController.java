package br.com.fdrtec.repairtipsv2.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fdrtec.repairtipsv2.domain.dtos.CategoryDTO;
import br.com.fdrtec.repairtipsv2.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoryDTO>> findAll(){
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDTO> findById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok().body(categoryService.findById(id));        
    }
    
}
