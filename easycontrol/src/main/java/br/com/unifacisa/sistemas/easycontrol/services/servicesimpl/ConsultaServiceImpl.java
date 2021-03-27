package br.com.unifacisa.sistemas.easycontrol.services.servicesimpl;

import br.com.unifacisa.sistemas.easycontrol.models.Consultas;
import br.com.unifacisa.sistemas.easycontrol.repositories.ConsultaRepository;
import br.com.unifacisa.sistemas.easycontrol.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServiceImpl implements ConsultaService {
    @Autowired
    ConsultaRepository consultaRepository;

    @Override
    public List<Consultas> findAll() {
        return consultaRepository.findAll();
    }

    @Override
    public Consultas findById(Long id) {
        return consultaRepository.findById(id).get();
    }

    @Override
    public Consultas save(Consultas consultas) {
        return consultaRepository.save(consultas);
    }
}
