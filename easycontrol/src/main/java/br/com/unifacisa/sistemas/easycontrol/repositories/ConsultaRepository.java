package br.com.unifacisa.sistemas.easycontrol.repositories;

import br.com.unifacisa.sistemas.easycontrol.models.Consultas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("consultaRepository")
public interface ConsultaRepository extends JpaRepository<Consultas, Long> {

}
