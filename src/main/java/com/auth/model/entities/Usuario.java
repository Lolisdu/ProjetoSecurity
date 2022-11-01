package com.auth.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name= "usuarios")
public class Usuario {
@Id
@GeneratedValue
private Long id;

@Column (name= "nome")
private String nome;

@Column(name= "email")
private String Email;

@Column (name= "senha")
private String Senha;



public Usuario(Long id, String nome, String email, String senha, List<Acesso> acessos) {
	super();
	this.id = id;
	this.nome = nome;
	Email = email;
	Senha = senha;
	this.acessos = acessos;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public String getEmail() {
	return Email;
}



public void setEmail(String email) {
	Email = email;
}



public String getSenha() {
	return Senha;
}



public void setSenha(String senha) {
	Senha = senha;
}



public List<Acesso> getAcessos() {
	return acessos;
}



public void setAcessos(List<Acesso> acessos) {
	this.acessos = acessos;
}



@Override
public String toString() {
	return "Usuario [id=" + id + ", nome=" + nome + ", Email=" + Email + ", Senha=" + Senha + ", acessos=" + acessos
			+ "]";
}



@ManyToMany
private List<Acesso> acessos;

}

