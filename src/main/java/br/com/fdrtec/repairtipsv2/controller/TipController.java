package br.com.fdrtec.repairtipsv2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fdrtec.repairtipsv2.model.entity.Tip;

@RestController
@RequestMapping("/tips")
public class TipController {

    @GetMapping
    public List<Tip> getAll(){
        return new ArrayList<Tip>();
    }    
}
