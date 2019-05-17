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
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

/**
 *
 * @author Marcelo Fernandes
 */
@Entity
public class Reserva implements Serializable {

    @Id
    @SequenceGenerator(name = "reserva_seq", sequenceName = "reserva_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserva_seq")
    private Long id;

    @ManyToOne
    @NotNull(message = "Por favor, selecione um espaço")
    private Espaco espaco;

    @Enumerated(EnumType.STRING)
    private EnumTipoEspaco tipo;

    @Enumerated(EnumType.STRING)
    private EnumStatusEspaco status;

    @Column(name = "data_inicial")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Campo Data Inicial é obrigatório")
    @DateTimeFormat(pattern = "dd/MM/yyyy")	//	Formata a data
    private Date dataInicial;

    @Column(name = "data_final")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Campo Data Final é obrigatório")
    @DateTimeFormat(pattern = "dd/MM/yyyy")	//	Formata a data
    private Date dataFinal;

    @Column(name = "pago")
    private String pago;

    @Column(name = "valor_pago")
    @NotNull(message = "Campo Valor Pago é obrigatório")
    @NumberFormat(pattern = "#,##0.00")
    private Double valorPago;

    @ManyToOne
    @NotNull(message = "Por favor, selecione um Hospede")
    private Morador morador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

}
