package com.tccProject.softwareDeControleCadastral.services.servicesimpl;

import com.tccProject.softwareDeControleCadastral.models.Consultas;
import com.tccProject.softwareDeControleCadastral.repositories.ConsultasRepository;
import com.tccProject.softwareDeControleCadastral.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ConsultaServiceImpl implements ConsultaService {
    @Autowired
    ConsultasRepository consultasRepository;

    @Override
    public List<Consultas> findAll() {
        return consultasRepository.findAll();
    }

    @Override
    public Consultas findById(Long id) {
        return consultasRepository.findById(id).get();
    }

    @Override
    public Consultas save(Consultas consultas) {
        return consultasRepository.save(consultas);
    }
}
