package br.com.unifacisa.sistemas.easycontrol.controllers;

import br.com.unifacisa.sistemas.easycontrol.models.Pacientes;
import br.com.unifacisa.sistemas.easycontrol.services.PacienteService;
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
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @RequestMapping(value = "/pacientes", method = RequestMethod.POST)
    public ResponseEntity<Pacientes> addPacientes (@Validated @RequestBody Pacientes paciente) {
        return new ResponseEntity<Pacientes>(pacienteService.save(paciente), HttpStatus.OK);
    }

    @RequestMapping(value = "/pacientes", method = RequestMethod.GET)
    public ResponseEntity<List<Pacientes>> getPacientes(){
        List<Pacientes> pacientes = pacienteService.findAll();
        return new ResponseEntity<List<Pacientes>>(pacientes, HttpStatus.OK);
    }


}
