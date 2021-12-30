package com.clauber.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.clauber.helpdesk.domain.enums.Perfil;

@Entity
public class Cliente extends Pessoa {
	
	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();
	
	/*Super Classes*/
	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);/*Sempre que um cliente é criado add perfil*/
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}
	
	/*Get and Sets*/
	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
	
}
