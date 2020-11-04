package com.tccProject.softwareDeControleCadastral.services;

import com.tccProject.softwareDeControleCadastral.models.Psicologo;

import java.util.List;

public interface PsicologoService {

    List<Psicologo> findAll();
    Psicologo findById(Long id);
    Psicologo save (Psicologo psicologo);
}
