package com.auth.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "postagem")
public class Viagem {

	@Id
	@GeneratedValue
	private Long id; 
	private String destino;
	private String origem;
	
	@Override
	public String toString() {
		return "Viagem [id=" + id + ", destino=" + destino + ", origem=" + origem + "]";
	}

	public Viagem(Long id, String destino, String origem) {
		super();
		this.id = id;
		this.destino = destino;
		this.origem = origem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
	
}
