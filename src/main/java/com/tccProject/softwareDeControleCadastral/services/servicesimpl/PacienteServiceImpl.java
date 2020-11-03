package com.tccProject.softwareDeControleCadastral.services.servicesimpl;

import com.tccProject.softwareDeControleCadastral.models.Pacientes;
import com.tccProject.softwareDeControleCadastral.repositories.PacienteRepository;
import com.tccProject.softwareDeControleCadastral.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Pacientes> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public Pacientes findById(Long id) {
        return pacienteRepository.findById(id).get();
    }

    @Override
    public Pacientes save(Pacientes paciente) {
        return pacienteRepository.save(paciente);
    }
}
