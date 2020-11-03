package com.tccProject.softwareDeControleCadastral.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Consultas {

    @Id @GeneratedValue
    private Long id;

    @NotNull
    private Date dataConsulta;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes")
    private Pacientes paciente;
}
