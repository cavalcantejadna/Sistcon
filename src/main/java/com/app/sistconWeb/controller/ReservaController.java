/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.sistconWeb.controller;


import com.app.sistconWeb.models.Reserva;
import com.app.sistconWeb.service.ReservaService;
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
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    private ReservaService service;
    
    @GetMapping
    public ModelAndView listaReserva() {
        ModelAndView modelAndView = new ModelAndView("dashboard/reserva");
        modelAndView.addObject("listaDeReserva", service.listarReserva());
        return modelAndView;
    }
    @GetMapping("/reservaAdd")
    public ModelAndView adicionarReserva(Reserva reserva) {
        ModelAndView modelAndView = new ModelAndView("dashboard/reservaAdd");
        modelAndView.addObject("reserva", reserva);
        return modelAndView;
    }

    @PostMapping("/salvar")
    public ModelAndView salvarReserva(@Valid Reserva reserva, BindingResult result) {
        if (result.hasErrors()) {
            return adicionarReserva(reserva);
        }
        service.salvarReserva(reserva);
        return listaReserva();
       
    }

    @GetMapping("/deletar/{id}")
    public ModelAndView deletarReserva(@PathVariable("id") Long id) {
        service.removerReserva(id);
        return listaReserva();
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarReserva(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("dashboard/reservaAdd");
        mv.addObject("reserva", service.findOne(id));
        return mv;
    }
}
