package br.com.unifacisa.sistemas.easycontrol.services;

import br.com.unifacisa.sistemas.easycontrol.models.Enderecos;

import java.util.List;

public interface EnderecoService {

    List<Enderecos> findAll();
    Enderecos findById(Long id);
    Enderecos save (Enderecos enderecos);
}
