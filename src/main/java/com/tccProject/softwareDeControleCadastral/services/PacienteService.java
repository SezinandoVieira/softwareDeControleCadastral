package com.tccProject.softwareDeControleCadastral.services;

import com.tccProject.softwareDeControleCadastral.models.Pacientes;

import java.util.List;

public interface PacienteService {

    List<Pacientes> findAll();
    Pacientes findById(Long id);
    Pacientes save (Pacientes paciente);
}
