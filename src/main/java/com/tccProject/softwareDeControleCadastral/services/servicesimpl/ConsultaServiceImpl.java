package com.tccProject.softwareDeControleCadastral.services.servicesimpl;

import com.tccProject.softwareDeControleCadastral.models.Consultas;
import com.tccProject.softwareDeControleCadastral.repositories.ConsultaRepository;
import com.tccProject.softwareDeControleCadastral.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServiceImpl implements ConsultaService {
    @Autowired
    ConsultaRepository consultaRepository;

    @Override
    public List<Consultas> findAll() {
        return consultaRepository.findAll();
    }

    @Override
    public Consultas findById(Long id) {
        return consultaRepository.findById(id).get();
    }

    @Override
    public Consultas save(Consultas consultas) {
        return consultaRepository.save(consultas);
    }
}
