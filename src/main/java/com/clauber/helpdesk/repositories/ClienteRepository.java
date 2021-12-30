package com.clauber.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clauber.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
