/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.repository;

import com.app.sistconWeb.models.Bloco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcelo Fernandes
 */
@Repository //Define a classe como um bean do Spring
public interface BlocoRepository extends JpaRepository <Bloco, Long> {
    // PagingAndSortingRepository -> disponibiliza diversos métodos para o acesso aos dados, além disso também podemos criar novos métodos como o findByNome e o findByNomeOrderByNome. 
    //estender JpaRepository e declarar a entidade (bloco) e o tipo de chave primária (Long)
}
