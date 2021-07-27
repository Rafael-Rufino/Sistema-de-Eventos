package com.eventoapp.eventoapp.repository;

import com.eventoapp.eventoapp.models.Convidado;

import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
  
}
