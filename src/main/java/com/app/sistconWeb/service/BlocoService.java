/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.service;

import com.app.sistconWeb.models.Bloco;
import com.app.sistconWeb.repository.BlocoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcelo Fernandes
 */
@Service //Define a classe como um bean do Spring
public class BlocoService {
    @Autowired
    private BlocoRepository br;
    
     //Retorna uma lista com todos os blocos inseridos
    public List<Bloco> listarBloco() {
		return br.findAll();
	}
	//Retorno um bloco a partir do ID
	public Bloco findOne(Long id) {
		return br.findOne(id);
	}
	//Salva ou atualiza um bloco
	public Bloco salvarBloco(Bloco bloco) {
		return br.saveAndFlush(bloco);
	}
         
        //Exclui um bloco
	public void removerBloco(Long id) {
		br.delete(id);
	}
}


