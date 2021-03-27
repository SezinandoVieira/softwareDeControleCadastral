package br.com.unifacisa.sistemas.easycontrol.services;

import br.com.unifacisa.sistemas.easycontrol.models.Psicologos;

import java.util.List;

public interface PsicologosService {

    List<Psicologos> findAll();
    Psicologos findById(Long id);
    Psicologos save (Psicologos psicologos);
}
