/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Marcelo Fernandes
 */
@Entity
public class Unidade implements Serializable {
    @Id
    @SequenceGenerator(name = "unidade_seq", sequenceName = "unidade_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unidade_seq")
    private int id;
    private String numero;
    private String area;
    private String enderecoProprietario;
    private String cpf;
    @ManyToOne
    private Condominio condominio;
    @OneToMany(mappedBy = "unidade")
    private List<Morador> moradores;
    @ManyToOne
    private Proprietario proprietario;
    
    

    public Unidade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getEnderecoProprietario() {
        return enderecoProprietario;
    }

    public void setEnderecoProprietario(String enderecoProprietario) {
        this.enderecoProprietario = enderecoProprietario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }
}
