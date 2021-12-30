package com.clauber.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clauber.helpdesk.domain.Chamado;
import com.clauber.helpdesk.domain.Cliente;
import com.clauber.helpdesk.domain.Tecnico;
import com.clauber.helpdesk.domain.enums.Perfil;
import com.clauber.helpdesk.domain.enums.Prioridade;
import com.clauber.helpdesk.domain.enums.Status;
import com.clauber.helpdesk.repositories.ChamadoRepository;
import com.clauber.helpdesk.repositories.ClienteRepository;
import com.clauber.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null, "Claubergol", "38434390523", "claubergol@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Cledilsim", "86671395306", "cledilsim@gmail.com", "1234");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primeiro Chamado", tec1, cli1); 
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
