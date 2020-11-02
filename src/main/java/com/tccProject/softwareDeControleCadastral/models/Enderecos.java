package com.tccProject.softwareDeControleCadastral.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Enderecos {

    @Id @GeneratedValue
    private int id;

    @Column(length = 8)
    private String cep;

    @Column(length = 255)
    private String rua;

    @Column(length = 5)
    private String numero;

    @Column(length = 100)
    private String bairro;

    @Column(length = 125)
    private String cidade;

    @Column(length = 125)
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes")
    private List<Pacientes> pacientes = new ArrayList<Pacientes>();


}
