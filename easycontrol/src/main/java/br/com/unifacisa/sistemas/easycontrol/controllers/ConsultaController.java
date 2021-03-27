package br.com.unifacisa.sistemas.easycontrol.controllers;

import br.com.unifacisa.sistemas.easycontrol.models.Consultas;
import br.com.unifacisa.sistemas.easycontrol.services.ConsultaService;
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
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @RequestMapping(value = "/consultas", method = RequestMethod.POST)
    public ResponseEntity<Consultas> addConsulta (@Validated @RequestBody Consultas consulta){
        return new ResponseEntity<Consultas>(consultaService.save(consulta), HttpStatus.OK);
    }

    @RequestMapping(value = "/consultas", method = RequestMethod.GET)
    public ResponseEntity<List<Consultas>> getConsultas(){
        List<Consultas> consultas = consultaService.findAll();
        return new ResponseEntity<List<Consultas>>(consultas, HttpStatus.OK);
    }


}
