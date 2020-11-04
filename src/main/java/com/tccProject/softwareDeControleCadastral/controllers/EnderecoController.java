package com.tccProject.softwareDeControleCadastral.controllers;

import com.tccProject.softwareDeControleCadastral.models.Enderecos;
import com.tccProject.softwareDeControleCadastral.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin (allowedHeaders = "*")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @RequestMapping(value = "/enderecos", method = RequestMethod.POST)
    public ResponseEntity<Enderecos> addEndereco(@Validated @RequestBody Enderecos endereco) {
        return new ResponseEntity<Enderecos>(enderecoService.save(endereco), HttpStatus.OK);
    }

    @RequestMapping(value = "/enderecos", method = RequestMethod.GET)
    public ResponseEntity<List<Enderecos>> getEnderecos() {
        List<Enderecos> enderecos = enderecoService.findAll();
        return new ResponseEntity<List<Enderecos>>(enderecos, HttpStatus.OK);
    }
}
