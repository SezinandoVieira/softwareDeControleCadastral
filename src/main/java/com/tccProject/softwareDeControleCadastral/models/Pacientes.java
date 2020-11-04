package com.tccProject.softwareDeControleCadastral.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Pacientes {

    @Id @GeneratedValue @NotNull
    private Long id;

    @NotNull
    @Column(length = 120)
    private String nome;

    @Column(length = 3)
    private byte idade;

    @NotNull
    @Column(length = 14, unique = true)
    private String cpf;

    @NotNull
    @Column(length = 9, unique = true)
    private char identidade;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(length = 10)
    private Date nascimento;

    @Column(length = 20)
    private String senha;

    @ManyToOne(cascade = CascadeType.ALL)
    private Enderecos endereco;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "consultas")
    private Consultas consulta;

}
