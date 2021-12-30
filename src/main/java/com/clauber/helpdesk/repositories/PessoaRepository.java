package com.clauber.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clauber.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
