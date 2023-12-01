package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Solicitante;
import com.app.web.repositorio.SolictanteRepositorio;

@SpringBootApplication
public class LenguajeProgramacionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LenguajeProgramacionApplication.class, args);
	}

	@Autowired
	private SolictanteRepositorio repositorio;
	@Override
	public void run(String... args) throws Exception {
		/*
		Solicitante solicitante1 = new Solicitante("pillaca", "analista","pillaca@gmail.com","antonio ribeyro 123", "lima", "soltero", "08/08/2003","jose antonio", 97873223);
		repositorio.save(solicitante1);
		Solicitante solicitante2 = new Solicitante("pariona", "desarrollador","pariona@gmail.com","garzon 234", "lima", "casado", "04/07/2003","juan luis", 2342422);
		repositorio.save(solicitante2);
	}
	*/
	}
}


