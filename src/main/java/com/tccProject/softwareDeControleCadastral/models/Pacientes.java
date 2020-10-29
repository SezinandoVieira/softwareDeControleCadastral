package com.tccProject.softwareDeControleCadastral.models;

import lombok.Data;

import java.util.Date;

@Data
public class Pacientes {

    private int id;

    private String nome;

    private String idade;

    private String cpf;

    private Date nascimento;




}
