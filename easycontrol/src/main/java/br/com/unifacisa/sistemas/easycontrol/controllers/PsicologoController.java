package br.com.unifacisa.sistemas.easycontrol.controllers;

import br.com.unifacisa.sistemas.easycontrol.models.Psicologos;
import br.com.unifacisa.sistemas.easycontrol.services.PsicologosService;
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
    private PsicologosService psicologosService;

    @RequestMapping(value = "/psicologos", method = RequestMethod.POST)
    public ResponseEntity<Psicologos> addPsicologo(@Validated @RequestBody Psicologos psicologo){
        return new ResponseEntity<Psicologos>(psicologosService.save(psicologo), HttpStatus.OK);
    }

    @RequestMapping(value = "/psicologos", method = RequestMethod.GET)
    public ResponseEntity<List<Psicologos>> getPsicologos() {
        List<Psicologos> psicologos = psicologosService.findAll();
        return new ResponseEntity<List<Psicologos>> (psicologos, HttpStatus.OK);
    }
}
