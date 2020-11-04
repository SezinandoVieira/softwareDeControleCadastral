package com.tccProject.softwareDeControleCadastral.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @Entity
public class Psicologo {

    @Id @GeneratedValue @NotNull
    private Long id;

    @Column (length = 200, unique = true)
    private String nome;

    @Column(length = 20)
    private String senha;
}
