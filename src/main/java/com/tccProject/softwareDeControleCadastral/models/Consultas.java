package com.tccProject.softwareDeControleCadastral.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Consultas {

    @Id @GeneratedValue
    private int id;

    private Date dataConsulta;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes")
    private Pacientes paciente;
}
