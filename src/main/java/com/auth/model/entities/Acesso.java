package com.auth.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "acesso")
public class Acesso {
	
	@Id
	@GeneratedValue
	private Long id;
	private String compras;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompras() {
		return compras;
	}
	public void setCompras(String compras) {
		this.compras = compras;
	}
	public Acesso(Long id, String compras) {
		super();
		this.id = id;
		this.compras = compras;
	}
	
	@Override
	public String toString() {
		return "Acesso [id=" + id + ", compras=" + compras + "]";
	}
	
	
	
	

}
