package com.tccProject.softwareDeControleCadastral.repositories;

import com.tccProject.softwareDeControleCadastral.models.Consultas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("consultaRepository")
public interface ConsultaRepository extends JpaRepository<Consultas, Long> {

}
