/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.repository;

import com.app.sistconWeb.models.Titulo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcelo Fernandes
 */
@Repository //Define a classe como um bean do Spring
public interface TituloRepository extends JpaRepository<Titulo, Long>{
    public List<Titulo> findByDescricaoContaining(String descricao);
}
