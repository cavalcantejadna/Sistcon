/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.service;

import com.app.sistconWeb.models.Reserva;
import com.app.sistconWeb.repository.ReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jadna Cavalcante
 */
@Service
public class ReservaService {
    
    @Autowired
    private ReservaRepository rs;
    
    public List<Reserva> listarReserva() {
		return rs.findAll();
	}
   
	//Retorno uma reserva a partir do ID
	public Reserva findOne(Long id) {
		return rs.findOne(id);
	}
	//Salva ou atualiza uma reserva feita
	public Reserva salvarReserva(Reserva reserva) {
		return rs.saveAndFlush(reserva);
	}
         
        //Exclui uma reserva
	public void removerReserva(Long id) {
		rs.delete(id);
	}
}
