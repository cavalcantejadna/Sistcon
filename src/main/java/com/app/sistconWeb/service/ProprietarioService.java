/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.service;

import com.app.sistconWeb.models.Proprietario;
import com.app.sistconWeb.repository.ProprietarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jadna Cavalcante
 */
@Service
public class ProprietarioService {
    
    @Autowired
    private ProprietarioRepository pr;
     
     //Retorna uma lista com todos os condominios inseridos
    public List<Proprietario> listarProprietario() {
		return pr.findAll();
	}
	//Retorno um condominio a partir do ID
	public Proprietario findOne(Long id) {
		return pr.findOne(id);
	}
	//Salva ou atualiza um condominio
	public Proprietario salvarProprietario(Proprietario proprietario) {
		return pr.saveAndFlush(proprietario);
	}
         
        //Exclui um condominio
	public void removerProprietario(Long id) {
		pr.delete(id);
	}
}
