package br.com.fdrtec.api.repairtips.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fdrtec.api.repairtips.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Fabiano Ramires", "abc@gmail.com", "3333-4444", "abc123");
        return ResponseEntity.ok().body(user);      
    }
    
}
