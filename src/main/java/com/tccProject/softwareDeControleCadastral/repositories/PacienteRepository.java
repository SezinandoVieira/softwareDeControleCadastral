package com.tccProject.softwareDeControleCadastral.repositories;

import com.tccProject.softwareDeControleCadastral.models.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pacienteRepository")
public interface PacienteRepository extends JpaRepository<Pacientes, Long> {

}
