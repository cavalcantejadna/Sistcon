/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.repository;

import com.app.sistconWeb.models.Reserva;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcelo Fernandes
 */
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
    public List<Reserva> findByDataInicialAndDataFinalAndMoradorNomeAndEspacoNome(Date dataInicial, Date dataFinal, String morador, String espaco);
}
