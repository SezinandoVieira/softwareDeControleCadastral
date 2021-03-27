package br.com.unifacisa.sistemas.easycontrol.services;

import br.com.unifacisa.sistemas.easycontrol.models.Pacientes;

import java.util.List;

public interface PacienteService {

    List<Pacientes> findAll();
    Pacientes findById(Long id);
    Pacientes save (Pacientes paciente);
}
