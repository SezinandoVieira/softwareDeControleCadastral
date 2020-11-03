package com.tccProject.softwareDeControleCadastral.services.servicesimpl;

import com.tccProject.softwareDeControleCadastral.models.Enderecos;
import com.tccProject.softwareDeControleCadastral.repositories.EnderecoRepository;
import com.tccProject.softwareDeControleCadastral.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public List<Enderecos> findAll() {
        return enderecoRepository.findAll();
    }

    @Override
    public Enderecos findById(Long id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public Enderecos save(Enderecos enderecos) {
        return enderecoRepository.save(enderecos);
    }
}
