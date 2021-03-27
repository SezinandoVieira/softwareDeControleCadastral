package br.com.unifacisa.sistemas.easycontrol.repositories;

import br.com.unifacisa.sistemas.easycontrol.models.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("enderecoRepository")
public interface EnderecoRepository extends JpaRepository<Enderecos, Long> {

}
