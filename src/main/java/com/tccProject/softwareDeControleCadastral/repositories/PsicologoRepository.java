package com.tccProject.softwareDeControleCadastral.repositories;

import com.tccProject.softwareDeControleCadastral.models.Psicologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("psicologoRepository")
public interface PsicologoRepository extends JpaRepository<Psicologo, Long> {

}
