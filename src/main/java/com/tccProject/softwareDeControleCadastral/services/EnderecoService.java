package com.tccProject.softwareDeControleCadastral.services;

import com.tccProject.softwareDeControleCadastral.models.Enderecos;

import java.util.List;

public interface EnderecoService {

    List<Enderecos> findAll();
    Enderecos findById(Long id);
    Enderecos save (Enderecos enderecos);
}
