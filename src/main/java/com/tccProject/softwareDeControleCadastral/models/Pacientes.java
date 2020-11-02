package com.tccProject.softwareDeControleCadastral.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Pacientes {

    @Id @GeneratedValue
    private int id;

    @Column(length = 120)
    private String nome;

    @Column(length = 3)
    private byte idade;

    @Column(length = 14, unique = true)
    private String cpf;

    @Column(length = 9, unique = true)
    private char identidade;

    @Column(length = 10)
    private Date nascimento;

    @ManyToOne(cascade = CascadeType.ALL)
    private Enderecos endereco;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "consultas")
    private Consultas consulta;

}
