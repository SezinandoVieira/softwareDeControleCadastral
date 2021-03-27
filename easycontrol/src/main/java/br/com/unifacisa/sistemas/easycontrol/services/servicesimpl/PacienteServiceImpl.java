package br.com.unifacisa.sistemas.easycontrol.services.servicesimpl;

import br.com.unifacisa.sistemas.easycontrol.models.Pacientes;
import br.com.unifacisa.sistemas.easycontrol.repositories.PacienteRepository;
import br.com.unifacisa.sistemas.easycontrol.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Pacientes> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public Pacientes findById(Long id) {
        return pacienteRepository.findById(id).get();
    }

    @Override
    public Pacientes save(Pacientes paciente) {
        return pacienteRepository.save(paciente);
    }
}
