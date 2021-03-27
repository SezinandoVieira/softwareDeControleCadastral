package br.com.unifacisa.sistemas.easycontrol.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Consultas {

    @Id
    @GeneratedValue
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @NotNull
    @Column(length = 20)
    private Date dataConsulta;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes")
    private Pacientes paciente;
}
