package com.eventoapp.eventoapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CADASTRO_EVENTO")
public class Evento implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long codigo;

  private String nome;
  private String local;
  private String data;
  private String horario;
  

  public long getCodigo() {
    return this.codigo;
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }
  

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLocal() {
    return this.local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHorario() {
    return this.horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }
  
}
