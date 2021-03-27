package br.com.unifacisa.sistemas.easycontrol.repositories;

import br.com.unifacisa.sistemas.easycontrol.models.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pacienteRepository")
public interface PacienteRepository extends JpaRepository<Pacientes, Long> {

}
