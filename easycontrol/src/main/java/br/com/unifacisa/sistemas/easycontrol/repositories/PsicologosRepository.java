package br.com.unifacisa.sistemas.easycontrol.repositories;

import br.com.unifacisa.sistemas.easycontrol.models.Psicologos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("psicologoRepository")
public interface PsicologosRepository extends JpaRepository<Psicologos, Long> {

}
