package com.tccProject.softwareDeControleCadastral.services.servicesimpl;

import com.tccProject.softwareDeControleCadastral.models.Psicologo;
import com.tccProject.softwareDeControleCadastral.repositories.PsicologoRepository;
import com.tccProject.softwareDeControleCadastral.services.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PsicologoServiceImpl implements PsicologoService {

    @Autowired
    PsicologoRepository psicologoRepository;


    @Override
    public List<Psicologo> findAll() {
        return psicologoRepository.findAll();
    }

    @Override
    public Psicologo findById(Long id) {
        return psicologoRepository.findById(id).get();
    }

    @Override
    public Psicologo save(Psicologo psicologo) {
        return psicologoRepository.save(psicologo);
    }
}
