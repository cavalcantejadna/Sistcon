/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.controller;

import com.app.sistconWeb.models.Bloco;
import com.app.sistconWeb.service.BlocoService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Marcelo Fernandes
 */
@Controller //Define a classe como um bean do Spring
@RequestMapping("/blocos")
public class BlocoController {
     @Autowired
    private BlocoService service; //Injeta a classe de serviços
     @GetMapping
    public ModelAndView listarBloco() {
        ModelAndView modelAndView = new ModelAndView("dashboard/bloco");
        modelAndView.addObject("listaDeBloco", service.listarBloco());
        return modelAndView;
    }
    @GetMapping("/blocoAdd")
    public ModelAndView adicionarBloco(Bloco bloco) {
        ModelAndView modelAndView = new ModelAndView("dashboard/blocoAdd");
        modelAndView.addObject("bloco", bloco);
        return modelAndView;
    }

    @PostMapping("/salvar")
    public ModelAndView salvarBloco(@Valid Bloco bloco, BindingResult result) {
        if (result.hasErrors()) {
            return adicionarBloco(bloco);
        }
        service.salvarBloco(bloco);
        return listarBloco();
       
    }

    @GetMapping("/deletar/{id}")
    public ModelAndView deletarBloco(@PathVariable("id") Long id) {
        service.removerBloco(id);
        return listarBloco();
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarBloco(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("dashboard/blocoAdd");
        mv.addObject("bloco", service.findOne(id));
        return mv;
    }
}
