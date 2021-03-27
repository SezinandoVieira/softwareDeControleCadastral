package br.com.unifacisa.sistemas.easycontrol.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
public class Enderecos {
    @Id @GeneratedValue @NotNull
    private Long id;

    @NotNull
    @Column(length = 8)
    private String cep;

    @NotNull
    @Column(length = 255)
    private String rua;

    @NotNull
    @Column(length = 5)
    private String numero;

    @NotNull
    @Column(length = 100)
    private String bairro;

    @NotNull
    @Column(length = 125)
    private String cidade;

    @Column(length = 125)
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes")
    private List<Pacientes> pacientes = new ArrayList<Pacientes>();
}
