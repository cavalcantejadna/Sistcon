/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.controller;

import com.app.sistconWeb.models.Proprietario;
import com.app.sistconWeb.service.ProprietarioService;
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
 * @author Jadna Cavalcante
 */
@Controller
@RequestMapping("/proprietarios")
public class ProprietarioController {
    @Autowired
    private ProprietarioService service;//	Injeta a classe de serviços
    
    @GetMapping
    public ModelAndView listaProprietario() {
        ModelAndView modelAndView = new ModelAndView("dashboard/proprietario");
        modelAndView.addObject("listaDeProprietario", service.listarProprietario());
        return modelAndView;
    }
    @GetMapping("add")
    public ModelAndView adicionarProprietario(Proprietario proprietario) {
        ModelAndView modelAndView = new ModelAndView("dashboard/proprietarioAdd");
        modelAndView.addObject("proprietario", proprietario);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("dashboard/proprietarioAdd");
        mv.addObject("proprietario", service.findOne(id));
        return mv;
    }
    

    @PostMapping("/salvar")
    public ModelAndView salvarCondominio(@Valid Proprietario proprietario, BindingResult result) {
        if (result.hasErrors()) {
            return adicionarProprietario(proprietario);
        }
        service.salvarProprietario(proprietario);
        return listaProprietario();     
    }
    @GetMapping("/deletar/{id}")
    public ModelAndView deletarProprietario(@PathVariable("id") Long id) {
        service.removerProprietario(id);
        return listaProprietario();
    }
}
