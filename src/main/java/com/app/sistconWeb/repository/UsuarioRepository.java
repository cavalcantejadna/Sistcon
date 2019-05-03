/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.repository;

import com.app.sistconWeb.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcelo Fernandes
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
