package br.com.unifacisa.sistemas.easycontrol.services.servicesimpl;

import br.com.unifacisa.sistemas.easycontrol.models.Psicologos;
import br.com.unifacisa.sistemas.easycontrol.repositories.PsicologosRepository;
import br.com.unifacisa.sistemas.easycontrol.services.PsicologosService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PsicologosServiceImpl implements PsicologosService {

    @Autowired
    PsicologosRepository psicologosRepository;


    @Override
    public List<Psicologos> findAll() {
        return psicologosRepository.findAll();
    }

    @Override
    public Psicologos findById(Long id) {
        return psicologosRepository.findById(id).get();
    }

    @Override
    public Psicologos save(Psicologos psicologo) {
        return psicologosRepository.save(psicologo);
    }
}
