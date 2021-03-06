package com.eventoapp.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TB_CADASTRO_EVENTO")
public class Evento implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long codigo;

  @NotEmpty 
  private String nome;

  @NotEmpty 
  private String local;

  @NotEmpty 
  private String data;

  @NotEmpty 
  private String horario;
  
  @OneToMany( mappedBy="evento", cascade=CascadeType.ALL, orphanRemoval=true)
  private List<Convidado> convidados;


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
