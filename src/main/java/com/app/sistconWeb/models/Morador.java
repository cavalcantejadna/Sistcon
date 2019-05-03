/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Marcelo Fernandes
 */
@Entity
public class Morador implements Serializable {

    
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "morador_seq", sequenceName = "morador_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "morador_seq")
    private Long id;
    @ManyToOne
    private Unidade unidade;
    private String nome;
    private String cpf;

    public Morador() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Morador{" + "id=" + id + ", unidade=" + unidade + ", nome=" + nome + ", cpf=" + cpf + '}';
    }

    
}
