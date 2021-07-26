package com.eventoapp.eventoapp.controllers;


import com.eventoapp.eventoapp.models.Evento;
import com.eventoapp.eventoapp.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {
  //injeçao de dependencia da interface
  @Autowired
  private EventoRepository er; //variavel


  @RequestMapping(value="/cadastrarEvento", method = RequestMethod.GET)
  public String form(){
    return "evento/formEvento";
  }

  @RequestMapping(value="/cadastrarEvento", method = RequestMethod.POST)
  public String form(Evento evento){
      er.save(evento);
      return "redirect:/cadastrarvento"; //direciador pra roda get
  }

  @RequestMapping("/evento")
  public ModelAndView listaEventos(){
    ModelAndView mv = new ModelAndView("index");
    Iterable<Evento> eventos = er.findAll();
    mv.addObject("eventos", eventos);
    return mv;
  }



  
}
