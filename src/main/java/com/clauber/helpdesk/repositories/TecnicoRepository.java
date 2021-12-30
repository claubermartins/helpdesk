package com.clauber.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clauber.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
