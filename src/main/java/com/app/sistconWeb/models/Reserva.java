/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.models;

import enumExemplo.EnumStatusEspaco;
import enumExemplo.EnumTipoEspaco;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Marcelo Fernandes
 */
@Entity
public class Reserva implements Serializable{
    
    @Id
    @SequenceGenerator(name = "reserva_seq", sequenceName = "reserva_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserva_seq")
    private int id;
    //@ManyToOne
    //private Unidade lote;
    @ManyToOne
    private Espaco espaco;
    
    @Enumerated(EnumType.STRING)
    private EnumTipoEspaco tipo;
    
    @Enumerated(EnumType.STRING)
    private EnumStatusEspaco status;
    
    @Column(name = "data_inicial")
    @Temporal(TemporalType.DATE)
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")	//	Formata a data
    private Date dataInicial;
    
    @Column(name = "data_final")
    @Temporal(TemporalType.DATE)
    //@NotNull(message = "Campo Data Final é obrigatório")
    @DateTimeFormat(pattern = "dd/MM/yyyy")	//	Formata a data
    private Date dataFinal;
    
    //@Temporal(TemporalType.TIMESTAMP)
    //private Calendar dataReserva;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public EnumTipoEspaco getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoEspaco tipo) {
        this.tipo = tipo;
    }

    public EnumStatusEspaco getStatus() {
        return status;
    }

    public void setStatus(EnumStatusEspaco status) {
        this.status = status;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

   
}
