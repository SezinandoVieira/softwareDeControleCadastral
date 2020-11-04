package com.tccProject.softwareDeControleCadastral.repositories;

import com.tccProject.softwareDeControleCadastral.models.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("enderecoRepository")
public interface EnderecoRepository extends JpaRepository<Enderecos, Long> {

}
