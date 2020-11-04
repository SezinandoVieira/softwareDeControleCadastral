package com.tccProject.softwareDeControleCadastral.controllers;

import com.tccProject.softwareDeControleCadastral.models.Psicologo;
import com.tccProject.softwareDeControleCadastral.services.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin(allowedHeaders = "*")
public class PsicologoController {

    @Autowired
    private PsicologoService psicologoService;

    @RequestMapping(value = "/psicologos", method = RequestMethod.POST)
    public ResponseEntity<Psicologo> addPsicologo(@Validated @RequestBody Psicologo psicologo){
        return new ResponseEntity<Psicologo>(psicologoService.save(psicologo), HttpStatus.OK);
    }

    @RequestMapping(value = "/psicologos", method = RequestMethod.GET)
    public ResponseEntity<List<Psicologo>> getPsicologos() {
        List<Psicologo> psicologos = psicologoService.findAll();
        return new ResponseEntity<List<Psicologo>> (psicologos, HttpStatus.OK);
    }
}
