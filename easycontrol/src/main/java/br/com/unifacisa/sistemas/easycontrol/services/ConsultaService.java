package br.com.unifacisa.sistemas.easycontrol.services;

import br.com.unifacisa.sistemas.easycontrol.models.Consultas;

import java.util.List;

public interface ConsultaService {

    List<Consultas> findAll();
    Consultas findById(Long id);
    Consultas save (Consultas consultas);
}
