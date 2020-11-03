package com.tccProject.softwareDeControleCadastral.repositories;

import com.tccProject.softwareDeControleCadastral.models.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacienteRepository extends JpaRepository<Pacientes, Long> {

}
