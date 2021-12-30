package com.clauber.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clauber.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
