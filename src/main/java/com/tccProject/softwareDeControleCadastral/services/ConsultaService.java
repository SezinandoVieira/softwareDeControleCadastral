package com.tccProject.softwareDeControleCadastral.services;

import com.tccProject.softwareDeControleCadastral.models.Consultas;

import java.util.List;

public interface ConsultaService {

    List<Consultas> findAll();
    Consultas findById(Long id);
    Consultas save (Consultas consultas);
}
