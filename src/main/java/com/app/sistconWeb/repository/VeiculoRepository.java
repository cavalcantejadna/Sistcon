/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.repository;

import com.app.sistconWeb.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcelo Fernandes
 */
@Repository //Define a classe como um bean do Spring
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    //Deve estender JpaRepository e declarar a entidade (veiculo) e o tipo de chave primária (Long)
}
